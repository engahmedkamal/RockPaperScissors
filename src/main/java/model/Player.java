package model;

import lombok.Data;

@Data
public class Player {
    private String name;
    private Shape shape;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }
}
