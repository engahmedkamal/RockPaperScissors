package service.impl;

import model.Player;
import model.enums.Shape;
import model.enums.Winner;
import service.GameService;

import java.util.EnumMap;

public class GameServiceImpl implements GameService {

    private static EnumMap<Shape, Shape> shapeRole;

    static {
        shapeRole = new EnumMap<>(Shape.class);
        shapeRole.put(Shape.Paper, Shape.Rock);
        shapeRole.put(Shape.Rock, Shape.Scissors);
        shapeRole.put(Shape.Scissors, Shape.Paper);
    }

    @Override
    public Winner judge(Player playerA, Player playerB) {
        if (playerA.getShape() == playerB.getShape()) {
            return Winner.TIE;
        }
        if (shapeRole.get(playerA.getShape()) == playerB.getShape()) {
            return Winner.PLAYER_A;
        }
        return Winner.PLAYER_B;
    }
}
