package midterm1;
import java.util.Stack;

public class PrintReverse {

    public static void main(String[] args) {
        reverse("Hello my name is Inigo Montoya");
    }

    public static void reverse(String str) {
        String[] words = str.split(" ");

        Stack<String> stringStack = new Stack<String>();
        for (String word : words) {
            stringStack.push(word);
        }

        while (!stringStack.empty()) {
            System.out.print(stringStack.pop() + " ");
        }
    }

}
