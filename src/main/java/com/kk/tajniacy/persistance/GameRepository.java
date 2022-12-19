package com.kk.tajniacy.persistance;

import com.kk.tajniacy.model.Game;
import com.kk.tajniacy.model.Tile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
}