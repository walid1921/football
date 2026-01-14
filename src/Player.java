import java.util.Random;

public class Player extends Person {

    protected int strength;
    protected int shotPower;
    protected int motivation;
    protected int goals;

    public Player(String name, int age, int strength, int shotPower, int motivation) {
        super(name, age);
        this.strength = validate(strength);
        this.shotPower = validate(shotPower);
        this.motivation = validate(motivation);
        this.goals = 0;
    }

    public int shootAtGoal() {
        Random random = new Random();
        int deviation = random.nextInt(4) - 2; // -2, -1, 0, +1
        return validate(shotPower + deviation);
    }

    public void addGoal() {
        goals++;
    }

    public int getGoals() {
        return goals;
    }

    @Override
    public String toString() {
        return "\nPlayer\n" +
                "name: " + name +
                "\nage: " + age +
                "\nstrength: " + strength +
                "\nshotPower: " + shotPower +
                "\nmotivation: " + motivation +
                "\ngoals: " + goals;
    }
}
