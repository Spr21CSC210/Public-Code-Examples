package midterm1;

public class Dinosaur {

    /* Fields (properties) class/static variables & instance variables */
    private double height;
    private int age;
    private boolean isAlive;
    private String name;

    /* Constructor */
    public Dinosaur() {
        height = 0.0;
        age = 0;
        isAlive = false;
        name = "";
    }

    public Dinosaur(double inputHeight, int age, boolean isAlive, String name) {
        height = inputHeight;
        this.age = age;
        this.isAlive = isAlive;
        this.name = name;
    }

    /* Methods */
    public int getAge() {
        return age;
    }

    public String toString() {
        return "Dinosaur named " + this.name + " is " + age + " years old.";
    }

}
