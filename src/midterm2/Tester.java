package midterm2;

public class Tester {
    
    public static void main(String[] args) {
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
