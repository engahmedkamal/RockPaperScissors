package service;

import model.GameScore;
import model.Player;
import model.Shape;
import model.Winner;

import java.util.Random;

public class GamePlayImpl implements GamePlay {


    @Override
    public GameScore play(int rounds) {
        Player playerA = new Player("Player A");
        playerA.setShape(Shape.Paper);

        Player playerB = new Player("Player B");

        Shape[] shapes = {Shape.Paper, Shape.Rock, Shape.Scissors};
        Random randomShape = new Random();

        GameScore gameScore = new GameScore();
        GameService gameService = new GameServiceImpl();

        for (int i = 0; i < rounds; i++) {
            playerB.setShape(shapes[randomShape.nextInt(3)]);
            Winner winner = gameService.judge(playerA, playerB);
            if (winner == Winner.PlayerA) {
                gameScore.incrementPlayerA();
            } else if (winner == Winner.PlayerB) {
                gameScore.incrementPlayerB();
            } else {
                gameScore.incrementTie();
            }
        }
        return gameScore;
    }
}
