import model.GameScore;
import org.junit.Before;
import org.junit.Test;
import service.GamePlay;
import service.GamePlayImpl;

import static org.junit.Assert.assertTrue;

public class GamePlayTest {
    private GamePlay gamePlay;

    @Before
    public void setup() {
        gamePlay = new GamePlayImpl();
    }

    @Test
    public void gameScoreSumTest() {
        int rounds = 100;
        GameScore gameScore = gamePlay.play(rounds);
        assertTrue((gameScore.getPlayerA() + gameScore.getPlayerB() + gameScore.getTie()) == rounds);
    }
}
