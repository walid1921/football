import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoachTest {

    @Test
    void givenExperienceHigherThan10_whenCoachCreated_thenExperienceIs10() {
        Coach coach = new Coach("Rehhagel", 84, 11);
        assertEquals(10, coach.getExperience());
    }

    @Test
    void givenExperienceLowerThan1_whenCoachCreated_thenExperienceIs1() {
        Coach coach = new Coach("Young Coach", 30, 0);
        assertEquals(1, coach.getExperience());
    }

    @Test
    void givenExperience7_whenCoachCreated_thenExperienceIs7() {
        Coach coach = new Coach("Normal Coach", 45, 7);
        assertEquals(7, coach.getExperience());
    }
}
