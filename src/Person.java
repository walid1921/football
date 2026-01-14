public abstract class Person { // abstract because you never create a Person directly — only Coach or Player.

    protected String name;
    protected int age;

    protected Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected int validate(int value) { // keep result inside 1..10
        if (value < 1) return 1;
        if (value > 10) return 10;
        return value;
    }

    protected String basicInfo() {
        return "name: " + name + "\nage: " + age;
    }
}
