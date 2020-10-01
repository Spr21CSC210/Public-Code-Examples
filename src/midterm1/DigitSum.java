package midterm1;

public class DigitSum {

    public static void main(String[] args) {
        System.out.println(digitSum(1729));
    }

    public static int digitSum(int n) {
        if (n < 10) {
            return n;
        } else {
            return (n % 10) + digitSum(n / 10);
        }
    }

}
