import java.util.Random;

public class Player extends Person {

    protected int strength;
    protected int shotPower;
    protected int motivation;
    protected int goals;

    public Player(String name, int age, int strength, int shotPower, int motivation, int goals) {
        super(name, age);
        this.strength = validate(strength);
        this.shotPower = validate(shotPower);
        this.motivation = validate(motivation);
        this.goals = goals;
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

    public int getMotivation() {
        return motivation;
    }

    public int getStrength() {
        return strength;
    }

    public String getName() {
        return name;
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
