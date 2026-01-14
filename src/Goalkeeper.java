import java.util.Random;

public class Goalkeeper extends Player {

    private int reaction;

    public Goalkeeper(String name, int age, int strength, int shotPower, int motivation, int reaction) {
        super(name, age, strength, shotPower, motivation);
        this.reaction = validate(reaction);
    }

    public boolean ballHold(int powerAtGoalKick) {
        Random random = new Random();
        int deviation = random.nextInt(3) - 1; // -1, 0, +1
        int effectiveReaction = validate(reaction + deviation);

        return effectiveReaction >= powerAtGoalKick;
    }

    @Override
    public String toString() {
        return "\nGoalkeeper\n" +
                "name: " + name +
                "\nage: " + age +
                "\nstrength: " + strength +
                "\nshotPower: " + shotPower +
                "\nmotivation: " + motivation +
                "\ngoals: " + goals +
                "\nreaction: " + reaction;
    }
}
