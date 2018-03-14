import model.Player;
import model.Shape;
import model.Winner;
import org.junit.Before;
import org.junit.Test;
import service.GameService;
import service.GameServiceImpl;

import static org.junit.Assert.assertTrue;

public class GameServiceTest {
    private Player playerA;
    private Player playerB;
    private GameService gameService;

    @Before
    public void setup() {
        playerA = new Player("Player A");
        playerB = new Player("Player B");
        gameService = new GameServiceImpl();
    }

    @Test
    public void TestScissorsBeatsPaper() {
        playerA.setShape(Shape.Paper);
        playerB.setShape(Shape.Scissors);

        assertTrue(gameService.judge(playerA, playerB) == Winner.PlayerB);
    }

    @Test
    public void TestPaperBeatsRock() {
        playerA.setShape(Shape.Paper);
        playerB.setShape(Shape.Rock);

        assertTrue(gameService.judge(playerA, playerB) == Winner.PlayerA);
    }

    @Test
    public void TestRockBeatsScissors() {
        playerA.setShape(Shape.Rock);
        playerB.setShape(Shape.Scissors);

        assertTrue(gameService.judge(playerA, playerB) == Winner.PlayerA);
    }

    @Test
    public void TestTie() {
        playerA.setShape(Shape.Rock);
        playerB.setShape(Shape.Rock);

        assertTrue(gameService.judge(playerA, playerB) == Winner.Tie);
    }
}
