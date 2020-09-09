
public class RecursionMultipleChoice {

    public static void main(String[] args) {
        System.out.println(mystery(648));

        System.out.println(secondMystery(348));

    }

    public static int mystery(int n) {
        if (n < 10) {
            return n;
        } else {
            int a = n / 10;
            int b = n % 10;
            return mystery(a + b);
        }
    }

    public static int secondMystery(int n) {
        if (n < 10) {
            return (10 * n) + n;
        } else {
            int a = secondMystery(n / 10);
            int b = secondMystery(n % 10);
            return (100 * a) + b;
        }
    }

}
