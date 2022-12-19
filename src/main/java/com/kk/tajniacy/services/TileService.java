package com.kk.tajniacy.services;

import com.kk.tajniacy.model.Tile;
import com.kk.tajniacy.persistance.TileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TileService {
    @Autowired
    private TileRepository tileRepository;

    public Tile save(Tile tile) {
        return tileRepository.save(tile);
    }

    public List<Tile> findAll() {
        return tileRepository.findAll();
    }

    public void pickTile(String tileName) {
        tileRepository.findAllByText(tileName).forEach(tile-> {
            tile.setClicked(true);
            tileRepository.save(tile);
        });
    }
}