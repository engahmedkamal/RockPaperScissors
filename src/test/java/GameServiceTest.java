import model.Player;
import model.Shape;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import service.GameService;
import service.GameServiceImpl;

import static org.junit.Assert.*;

public class GameServiceTest {
    private Player playerA;
    private Player playerB;
    private GameService gameService;

    @Before
    public void setUp() {
        playerA = new Player("Player A");
        playerB = new Player("Player B");
        gameService = new GameServiceImpl();
    }

    @Test
    public void TestScissorsBeatsPaper() {
        playerA.setShape(Shape.Paper);
        playerB.setShape(Shape.Scissors);

        gameService.play(playerA, playerB);

        assertTrue(playerB.getScore() == 1 && playerA.getScore() == 0);
    }

    @Test
    public void TestPaperBeatsRock() {
        playerA.setShape(Shape.Paper);
        playerB.setShape(Shape.Rock);

        GameService gameService = new GameServiceImpl();
        gameService.play(playerA, playerB);

        assertTrue(playerB.getScore() == 0 && playerA.getScore() == 1);
    }

    @Test
    public void TestRockBeatsScissors() {
        playerA.setShape(Shape.Rock);
        playerB.setShape(Shape.Scissors);

        GameService gameService = new GameServiceImpl();
        gameService.play(playerA, playerB);

        assertTrue(playerB.getScore() == 0 && playerA.getScore() == 1);
    }

    @Test
    public void TestTie() {
        playerA.setShape(Shape.Rock);
        playerB.setShape(Shape.Rock);

        GameService gameService = new GameServiceImpl();
        gameService.play(playerA, playerB);

        assertTrue(playerB.getScore() == 0 && playerA.getScore() == 0);
    }
}
