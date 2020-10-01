package midterm1;
public class Subsets {

    public static void main(String[] args) {
        genSubsets("abc");
    }

    public static void genSubsets(String s) {
        subsetsHelper(s, "");
    }

    public static void subsetsHelper(String chars, String soFar) {
        if (chars.isEmpty()) {
            System.out.println(soFar);
        } else {
            // Either we include that character
            subsetsHelper(chars.substring(1), soFar + chars.charAt(0));

            // Or we don't include that character
            subsetsHelper(chars.substring(1), soFar);
        }
    }
}
