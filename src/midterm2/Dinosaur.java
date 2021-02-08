package midterm2;

public class Dinosaur {

    private String color;
    private int weight;
    private String name;

    public Dinosaur() {
        this("Green", 0, "CHANGE ME");
    }

    public Dinosaur(String color, int weight, String name) {
        this.color = color;
        this.weight = weight;
        this.name = name;
    }

    public String getColor() {
        return this.color;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public String toString() {
        return name + " weighs " + weight + " and is " + color + ".";
    }

}
