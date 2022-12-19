package com.kk.tajniacy.dto;

import com.kk.tajniacy.model.Tile;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class RoundDto {
    private String gameName;
    private List<Tile> tiles;
}
