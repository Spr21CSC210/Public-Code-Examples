package midterm3;

//2. We learned about static imports.
//This allows you to use PI and pow in main without qualifying them with their
//  full names.

public class CircleArea {

    public static void main(String[] args) {
        // 1. We learned that you never need to use imports. You can always
        // qualify the full name like below.
        Scanner scanner = new java.util.Scanner(System.in);

        Double radius = Double.valueOf(scanner.nextLine());

        Double area = PI * pow(radius, 2);

        System.out.println(area);

    }

}
