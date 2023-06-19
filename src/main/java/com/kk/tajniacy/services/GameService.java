package com.kk.tajniacy.services;

import com.kk.tajniacy.dto.RoundDto;
import com.kk.tajniacy.dto.WordsDto;
import com.kk.tajniacy.model.Color;
import com.kk.tajniacy.model.Game;
import com.kk.tajniacy.model.Tile;
import com.kk.tajniacy.model.Word;
import com.kk.tajniacy.persistance.GameRepository;
import com.kk.tajniacy.utils.Words;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GameService {

    private final GameRepository gameRepository;
    private List<Word> words;

    @PostConstruct
    public void init() {
        initWords();
        startNewGame();
    }

    private void initWords() {
        words = new ArrayList<>();
        Words.starterWords.forEach(word -> words.add(
                Word.builder().word(word).inUse(true).build())
        );
    }

    public Game save(Game game) {
        return gameRepository.save(game);
    }

    public List<Game> findAll() {
        return gameRepository.findAll();
    }

    public RoundDto getRoundData() {
        List<Game> game = gameRepository.findAll();
        if (game.size() > 1) {
            throw new RuntimeException("Not only one game in database");
        }
        return RoundDto.builder()
                .gameName(game.get(0).getName())
                .tiles(game.get(0).getTiles())
                .build();
    }

    public Game startNewGame() {
        List<Game> game = gameRepository.findAll();
        Color starting = Color.RED;
        if (!game.isEmpty()) {
            starting = game.get(0).getStartingColor() == Color.RED ? Color.BLUE : Color.RED;
            gameRepository.delete(game.get(0));
        }
        Color second = starting == Color.RED ? Color.BLUE : Color.RED;

        List<String> words = getWordsInUse();
        Collections.shuffle(words);
        List<Tile> tiles = words.subList(0, 25)
                .stream()
                .map(word -> Tile.builder().text(word).isClicked(false).build())
                .collect(Collectors.toList());
        int count = 0;
        for (Tile tile : tiles) {
            tile.setColor(getColor(count, starting, second));
            count++;
        }

        Collections.shuffle(tiles);
        Game newGame = Game.builder()
                .name(UUID.randomUUID().toString())
                .tiles(tiles)
                .startingColor(starting)
                .build();
        tiles.forEach(tile -> tile.setGame(newGame));
        return gameRepository.save(newGame);
    }

    public void resetWords() {
        initWords();
    }

    public WordsDto getAllWords() {
        WordsDto wordsDto = new WordsDto();
        wordsDto.setWords(words);
        return wordsDto;
    }

    public void setWords(WordsDto wordsDto) {
        this.words = wordsDto.getWords();
    }

    private List<String> getWordsInUse() {
        return words.stream()
                .filter(Word::isInUse)
                .map(Word::getWord)
                .collect(Collectors.toList());
    }

    private Color getColor(int count, Color starting, Color second) {
        if (count < 9) {
            return starting;
        }
        else if (count < 17) {
            return second;
        }
        else if (count < 18) {
            return Color.BLACK;
        }
        else {
            return Color.BLANK;
        }
    }
}