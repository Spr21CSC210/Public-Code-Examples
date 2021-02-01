package midterm1;

public class LargestDigit {
    public static void main(String[] args) {
        System.out.println(largestDigit(8342116));
        System.out.println(largestDigit(40109));
        System.out.println(largestDigit(-163505));
    }

    // The recursive leap of faith
    public static int largestDigit(int n) {
        if (n < 0) {
            return largestDigit(-n);
        } else if (n < 10) {
            return n;
        } else {
            return Math.max(n % 10, largestDigit(n / 10));
        }
    }
}
