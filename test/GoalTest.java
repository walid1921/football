import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoalTest {

    @Test
    void givenGoalScored_whenAddGoalCalled_thenGoalsIncreaseByOne() {
        Goalkeeper player = new Goalkeeper("Müller", 25, 8, 9, 7, 8);

        int initialGoals = player.getGoals();

        player.addGoal();

        assertEquals(initialGoals + 1, player.getGoals());
    }
}
