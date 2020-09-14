
public class Tester {

    public static void main(String[] args) {
        // Dinosaur dino = new Dinosaur(20.2, 17, false, "Cynthia");
        //
        // System.out.println(dino.toString());

        Static first = new Static(10);
        System.out.println(first);

        first.incrementInstanceInt();
        Static.incrementStaticInt();

        Static second = new Static(5);

        Static.incrementStaticInt();

        System.out.println(first);
        System.out.println(second);
    }
}
