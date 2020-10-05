package midterm2;

public class VisibilityMain {
    public static void main(String[] args) {
        System.out.println(new B().toString());

        A.foo();
        B.foo();
        A.bar();
        B.bar();
    }
}
