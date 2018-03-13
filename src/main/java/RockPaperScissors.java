import model.Player;
import model.Shape;
import service.GameService;
import service.GameServiceImpl;

import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {

        Player playerA = new Player("Player A");
        playerA.setShape(Shape.Paper);

        Player playerB = new Player("Player B");

        Shape[] shapes = {Shape.Paper, Shape.Rock, Shape.Scissors};
        Random randomShape = new Random();

        GameService gameService = new GameServiceImpl();

        for (int i = 0; i < 100; i++) {
            playerB.setShape(shapes[randomShape.nextInt(3)]);
            gameService.play(playerA, playerB);
        }
        System.out.println("Player A wins " + playerA.getScore() + " of 100 games");
        System.out.println("Player B wins " + playerB.getScore() + " of 100 games");
        System.out.println("Tie: " + (100 - (playerA.getScore() + playerB.getScore())) + " of 100 games");
    }
}
