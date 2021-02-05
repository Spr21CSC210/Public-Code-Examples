package midterm1;

public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("computer", "core"));
        System.out.println(isSubsequence("computer", "cope"));
        System.out.println(isSubsequence("computer", "computer"));
        System.out.println(isSubsequence("", ""));
    }

    public static boolean isSubsequence(String s1, String s2) {
        if (s2.isEmpty()) {
            return true;
        }
        if (s1.isEmpty()) {
            return false;
        }

        if (s1.charAt(0) == s2.charAt(0)) {
            return isSubsequence(s1.substring(1), s2.substring(1));
        } else {
            return isSubsequence(s1.substring(1), s2);
        }
    }
}
