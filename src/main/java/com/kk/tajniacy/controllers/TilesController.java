package com.kk.tajniacy.controllers;

import com.kk.tajniacy.dto.RoundDto;
import com.kk.tajniacy.dto.WordsDto;
import com.kk.tajniacy.model.Game;
import com.kk.tajniacy.model.Tile;
import com.kk.tajniacy.services.GameService;
import com.kk.tajniacy.services.TileService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = {"http://localhost:4200", "https://kacperkk2.github.io"})
public class TilesController {

    private final TileService tileService;
    private final GameService gameService;

    @PostMapping("/game")
    public Game newGame() {
        return gameService.startNewGame();
    }

    @GetMapping("/game")
    public RoundDto joinGame() {
        return gameService.getRoundData();
    }

    @GetMapping("/tiles")
    public List<Tile> getAll() {
        return tileService.findAll();
    }

    @PostMapping("/tiles")
    public void pickTile(@RequestParam String tileName) {
        tileService.pickTile(tileName);
    }

    @PostMapping("/words")
    public void setWords(@RequestBody WordsDto wordsDto) {
        gameService.setWords(wordsDto);
    }

    @GetMapping("/words")
    public WordsDto getAllWords() {
        return gameService.getAllWords();
    }

    @PostMapping("/words/reset")
    public void resetWords() {
        gameService.resetWords();
    }
}
