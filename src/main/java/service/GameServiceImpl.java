package service;

import model.Player;
import model.Shape;
import model.Winner;

import java.util.HashMap;

public class GameServiceImpl implements GameService {

    private static HashMap<Shape, Shape> shapeRole;

    static {
        shapeRole = new HashMap<>();
        shapeRole.put(Shape.Paper, Shape.Rock);
        shapeRole.put(Shape.Rock, Shape.Scissors);
        shapeRole.put(Shape.Scissors, Shape.Paper);
    }

    @Override
    public Winner judge(Player player1, Player player2) {
        if (player1.getShape() == player2.getShape()) {
            return Winner.Tie;
        }
        if (shapeRole.get(player1.getShape()) == player2.getShape()) {
            return Winner.PlayerA;
        }
        return Winner.PlayerB;
    }
}
