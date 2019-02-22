import model.enums.Shape;
import service.GamePlay;
import service.impl.GamePlayImpl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameRunner {

    public static void main(String[] args) {
        welcomeMessage();
        Shape[] shapes = {Shape.Rock, Shape.Paper, Shape.Scissors};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Player Name:-");
        String firstPlayerName = scanner.nextLine();
        GamePlay gamePlay = new GamePlayImpl(firstPlayerName);
        System.out.println("Let began :-");
        int game = -1;
        try {
            while (game <= 3) {
                System.out.println("please choose you game, Enter \n1 for rock \n2 for paper\n3 for scissor \nand if you want to end the game just enter any other number");
                game = scanner.nextInt();
                if (game <= 3) {
                    gamePlay.play(shapes[game - 1]);
                } else {
                    gamePlay.announceWinner();
                }
            }
        } catch (InputMismatchException ex) {
            System.out.println("you can never when with cheating you lose");
        }

    }

    private static void welcomeMessage() {
        System.out.println("Welcome To Rock Paper Scissor Game");
        System.out.println("Rules is so easy");
        System.out.println("A player who decides to play rock will beat another player who has chosen scissors \n(\"rock Paper scissors\" or sometimes \"blunts scissors\"),\n but will lose to one who has played paper (\"paper covers rock\");\n a play of paper will lose to a play of scissors (\"scissors cuts paper\").");
    }
}
