package midterm4;

import java.util.ArrayList;
import java.util.List;

public class DiceSum {
    public static void main(String[] args) {
        diceSum(3, 5);
    }

    private static void diceSum(int numDie, int desiredSum) {
        diceSumHelper(numDie, desiredSum, new ArrayList<Integer>());
        System.out.println(calls);
    }

    private static int calls = 0;

    private static void diceSumHelper(int numDie, int desiredSum,
            List<Integer> chosen) {
        calls++;
        if (numDie == 0) {
            if (desiredSum == 0) {
                System.out.println(chosen);
            }
        } else if (numDie * 1 <= desiredSum && numDie * 6 >= desiredSum) {
            for (int i = 1; i <= 6; i++) {
                // Choose
                chosen.add(i);
                
                // Explore
                diceSumHelper(numDie - 1, desiredSum - i, chosen);
                
                //Unchoose
                chosen.remove(chosen.size() - 1);
            }

        }
    }
}
