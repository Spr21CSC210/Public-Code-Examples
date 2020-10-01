package midterm2;

public class Static {

    private int instanceInt;

    private static int staticInt;

    public Static(int instanceInt) {
        this.instanceInt = instanceInt;
        staticInt = instanceInt;
    }

    public void incrementInstanceInt() {
        instanceInt++;
    }

    public static void incrementStaticInt() {
        staticInt++;
    }

    public String toString() {
        return "instanceInt: " + instanceInt + " staticInt: " + staticInt;
    }
}
