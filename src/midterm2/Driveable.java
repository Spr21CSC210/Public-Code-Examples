package midterm2;

public interface Driveable {
    /* One constant. */
    public static final int MAX_SPEED = 120;

    /* Static method */
    public static boolean hasEngine() {
        return true;
    }

    /* A couple abstract methods. */
    public abstract int getNumWheels();

    public double getSpeed();

    public double setSpeed();

    public boolean changeGears(int toGear);
}
