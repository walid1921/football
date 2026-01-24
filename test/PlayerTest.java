import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    @Test
    void givenGoalScored_whenAddGoalCalled_thenGoalsIncreaseByOne() {
        Player player = new Player("Müller", 25, 8, 9, 7, 0);
        player.addGoal();
        assertEquals(1, player.getGoals());
    }
}
