import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReverseLines {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("TestCases/InputTest01"));
        reverseLines(scanner);
        scanner.close();
    }

    public static void reverseLines(Scanner scanner) {
        if (scanner.hasNext()) {
            String line = scanner.nextLine();
            reverseLines(scanner);
            System.out.println(line);
        }
    }

}
