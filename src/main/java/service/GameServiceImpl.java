package service;

import model.Player;
import model.Shape;

import java.util.HashMap;

public class GameServiceImpl implements GameService {

    private HashMap<Shape, Shape> shapes;

    public GameServiceImpl() {
        shapes = new HashMap<>();
        shapes.put(Shape.Paper, Shape.Rock);
        shapes.put(Shape.Rock, Shape.Scissors);
        shapes.put(Shape.Scissors, Shape.Paper);
    }
    @Override
    public void play(Player player1, Player player2) {
        if (player1.getShape().equals(player2.getShape())) {
            return;
        }
        if (shapes.get(player1.getShape()).equals(player2.getShape())) {
            player1.setScore(player1.getScore() + 1);
        } else {
            player2.setScore(player2.getScore() + 1);
        }
    }
}
