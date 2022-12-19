package com.kk.tajniacy.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.Tolerate;

import java.util.List;

@Entity
@Table(name = "games")
@Getter
@Builder
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "starting_color")
    @Enumerated(EnumType.STRING)
    private Color startingColor;

    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Tile> tiles;


    @Tolerate
    Game() {}
}
