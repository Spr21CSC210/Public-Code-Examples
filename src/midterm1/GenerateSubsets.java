package midterm1;

public class GenerateSubsets {

    public static void main(String[] args) {
        genSubsets("abc");
    }

    public static void genSubsets(String s) {
        genSubsetsHelper(s, "");
    }

    public static void genSubsetsHelper(String s, String soFar) {
        if (s.isEmpty()) {
            System.out.println(soFar);
        } else {
            char ch = s.charAt(0);
            genSubsetsHelper(s.substring(1), soFar + ch);

            genSubsetsHelper(s.substring(1), soFar);
        }
    }

}
