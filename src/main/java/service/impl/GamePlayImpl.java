package service.impl;

import model.Player;
import model.enums.Shape;
import model.enums.Winner;
import service.GamePlay;
import service.GameService;

import java.util.Random;

public class GamePlayImpl implements GamePlay {

    private Player human;

    private Player pc;

    private GameService gameService;

    private static final Shape[] SHAPES = {Shape.Paper, Shape.Rock, Shape.Scissors};

    private Random randomShape = new Random();

    public GamePlayImpl(String playerName) {
        gameService = new GameServiceImpl();
        human = new Player(playerName);
        pc = new Player("pc");
    }


    @Override
    public void play(Shape humanSelectedShape) {
        human.setShape(humanSelectedShape);
        pc.setShape(SHAPES[randomShape.nextInt(3)]);
        System.out.println("Player " + human.getName() + " choose " + human.getShape());
        System.out.println("Player " + pc.getName() + " choose " + pc.getShape());
        System.out.print("The winner is:");
        Winner winner = gameService.judge(human, pc);
        if (Winner.TIE == winner) {
            System.out.println(" Tie");
        } else if (Winner.PLAYER_A == winner) {
            System.out.println(human.getName());
            human.incrementScore();
        } else {
            System.out.println(pc.getName());
            pc.incrementScore();
        }
        System.out.println("Total score is " + human.getName() + " score " + human.getScore());
        System.out.println("Total score is " + pc.getName() + " score " + pc.getScore());
    }

    @Override
    public void announceWinner() {
        if (human.getScore() > pc.getScore()) {
            System.out.println(human.getName() + " is the winner");
        } else if (human.getScore() < pc.getScore()) {
            System.out.println(pc.getName() + " is the winner");
        } else {
            System.out.println("Draw no winner");
        }
    }
}
