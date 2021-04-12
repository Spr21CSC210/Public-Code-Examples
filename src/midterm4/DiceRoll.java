package midterm4;

import java.util.ArrayList;
import java.util.List;

public class DiceRoll {
    public static void main(String[] args) {
        diceRoll(3);
    }

    private static void diceRoll(int numDie) {
        diceRollHelper(numDie, new ArrayList<Integer>());
    }

    private static void diceRollHelper(int numDie, List<Integer> chosen) {
        // Base case is when no more decisions are to be made
        if (numDie == 0) {
            System.out.println(chosen);
        } else {
            for (int i = 1; i <= 6; i++) {
                // Choose
                chosen.add(i);

                // Explore
                diceRollHelper(numDie - 1, chosen);

                // Unchoose
                chosen.remove(chosen.size() - 1);
            }
        }
    }

}
