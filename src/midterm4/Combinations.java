package midterm4;

import java.util.Set;
import java.util.TreeSet;

public class Combinations {
    public static void main(String[] args) {
        combos("GOOGLE", 3);
    }

    private static void combos(String s, int k) {
        Set<String> solutions = new TreeSet<String>();
        combosHelper(s, k, "", solutions);
        System.out.println(solutions);
    }

    private static void combosHelper(String s, int k, String soFar,
            Set<String> solutions) {
        if (k == 0) {
            solutions.add(soFar);
        } else {
            for (int i = 0; i < s.length(); i++) {
                String choice = s.substring(i, i + 1);

                if (!soFar.contains(choice)) {
                    combosHelper(s.substring(0, i) + s.substring(i + 1), k - 1,
                            soFar + choice, solutions);
                }
            }
        }
    }
}
