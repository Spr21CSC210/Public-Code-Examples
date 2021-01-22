package midterm1;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MutualFriends {

    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Set<String>> friendMap = createFriendMap(
                "TestCases/friendList");

        Scanner userInput = new Scanner(System.in);
        while (true) {
            System.out.println("Insert first name: ");
            String first = userInput.nextLine();
            System.out.println("Insert second name: ");
            String second = userInput.nextLine();
            if (first.equals("") || second.equals("")) {
                break;
            }

            Set<String> friends = friendMap.get(first);
            friends.retainAll(friendMap.get(second));
            System.out.println(friends);
        }
    }

    private static Map<String, Set<String>> createFriendMap(String filename) {
        return null;
    }
}
