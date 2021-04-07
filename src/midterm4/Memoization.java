package midterm4;

import java.util.HashMap;
import java.util.Map;

public class Memoization {
    private static int numCalls = 0;

    private static Map<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(fib(26));
        System.out.println(numCalls);
    }

    // 0, 1, 1, 2, 3, 5, 8, 13, 21...
    public static int fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(
                    "Cannot pass in negative values");
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        numCalls++;
        if (n == 0 || n == 1) {
            memo.put(n, n);
            return n;
        } else {
            int result = fib(n - 1) + fib(n - 2);
            memo.put(n, result);
            return result;
        }

    }
}
