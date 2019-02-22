package model;

import lombok.Data;
import model.enums.Shape;

@Data
public class Player {
    private String name;
    private Shape shape;
    private int score;

    public Player(String name) {
        this.name = name;
    }

    public void incrementScore(){
        this.score++;
    }
}
