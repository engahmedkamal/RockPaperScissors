package model;

import lombok.Data;

@Data
public class GameScore {
    private int playerA;
    private int playerB;
    private int tie;

    public void incrementPlayerA() {
        playerA++;
    }

    public void incrementPlayerB() {
        playerB++;
    }

    public void incrementTie() {
        tie++;
    }
}
