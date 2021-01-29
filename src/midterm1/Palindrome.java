package midterm1;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("step on no pets"));
        System.out.println(isPalindrome("java"));
        System.out.println(isPalindrome("byebye"));
    }

    public static boolean isPalindrome(String s) {
        // Base + Recursive Case must account for all valid inputs

        // Base Case - where our recursion stops
        if (s.length() <= 1) {
            return true;
        }
        
        // Recursive Case - must progress towards base case
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrome(s.substring(1, s.length() - 1));
        } else {
            return false;
        }
    }
}
