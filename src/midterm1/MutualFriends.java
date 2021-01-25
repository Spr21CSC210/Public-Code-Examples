package midterm1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MutualFriends {

    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Set<String>> friendMap = createFriendMap(
                "TestCases/friendList");
        System.out.println(friendMap);

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
        userInput.close();
    }

    private static Map<String, Set<String>> createFriendMap(String filename)
            throws FileNotFoundException {
        Map<String, Set<String>> friendMap = new HashMap<String, Set<String>>();
        
        Scanner fileReader = new Scanner(new File(filename));

        String key = fileReader.nextLine();

        while (fileReader.hasNext()) {
            String friend = fileReader.nextLine();

            if (friend.equals("") && fileReader.hasNext()) {
                key = fileReader.nextLine();
                continue;
            }

            if (friendMap.containsKey(key)) {
                friendMap.get(key).add(friend);
            } else {
                Set<String> newFriends = new HashSet<String>();
                newFriends.add(friend);
                friendMap.put(key, newFriends);
            }
        }
        fileReader.close();
        
        return friendMap;
    }
}
