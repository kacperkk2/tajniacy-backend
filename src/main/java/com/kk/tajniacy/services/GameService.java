package com.kk.tajniacy.services;

import com.kk.tajniacy.dto.RoundDto;
import com.kk.tajniacy.model.Color;
import com.kk.tajniacy.model.Game;
import com.kk.tajniacy.model.Tile;
import com.kk.tajniacy.persistance.GameRepository;
import com.kk.tajniacy.persistance.TileRepository;
import com.kk.tajniacy.utils.Words;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GameService {

    private final GameRepository gameRepository;

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

        List<String> words = new ArrayList<>(Words.words);
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
        Game newGame = Game.builder().name("asd").tiles(tiles).startingColor(starting).build();
        tiles.forEach(tile -> tile.setGame(newGame));
        return gameRepository.save(newGame);
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