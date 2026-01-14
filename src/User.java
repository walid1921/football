public class User {

    private String name;
    private int age;
    private int experience;

    public int validate () {
        if (this.experience < 1) return 1;
        if (this.experience > 10) return 10;
        return this.experience;
    }


    void syaHello(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }
}
