import model.GameScore;
import service.GamePlay;
import service.GamePlayImpl;

public class GameRunner {

    public static void main(String[] args) {
        GamePlay gamePlay = new GamePlayImpl();
        GameScore gameScore = gamePlay.play(100);

        System.out.println("Player A wins " + gameScore.getPlayerA() + " of 100 games");
        System.out.println("Player B wins " + gameScore.getPlayerB() + " of 100 games");
        System.out.println("Tie: " + gameScore.getTie() + " of 100 games");
    }
}
