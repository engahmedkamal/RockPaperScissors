package model;

import lombok.Data;

@Data
public class Player {
    private String name;
    private Shape shape;

    public Player(String name) {
        this.name = name;
    }
}
