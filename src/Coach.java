
public class Coach extends Person {

    private int experience;

    public Coach(String name, int age, int experience) {
        super(name, age); // call Person constructor
        this.experience = validate(experience);
    }

    public int getExperience() {
        return experience;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\nCoach\n" +
                "name: " + this.name +
                "\nage: " + this.age +
                "\nexperience: " + this.experience;
    }
}
