package midterm4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class Lambda {

    public static void main(String[] args) {
        timeMethod(() -> heuristic());
        timeMethod(() -> backtrack());

        List<Integer> list = new ArrayList<Integer>();
        list.add(6);
        list.add(7);
        list.add(8);
        list.forEach((value) -> System.out.println(value));
    }

    public static void timeMethod(BooleanSupplier s) {
        long startTime = System.nanoTime();
        s.getAsBoolean();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        System.out.println("Took " + duration + " milliseconds");
    }

    public static boolean heuristic() {
        System.out.println(Integer.MAX_VALUE + Integer.MAX_VALUE - 1);
        return true;
    }

    public static boolean backtrack() {
        int sum = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
        return true;
    }

}
