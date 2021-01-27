package midterm1;

import java.util.Stack;

public class PrintReverse {

    public static void main(String[] args) {
        reverse("Hello my name is Inigo Montoya");
    }

    public static void reverse(String str) {
        String[] words = str.split(" ");
        Stack<String> stack = new Stack<String>();
        for (String word : words) {
            stack.push(word);
        }

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

}
