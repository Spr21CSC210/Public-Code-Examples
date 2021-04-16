package midterm4;

public class BinaryNumbers {
    public static void main(String[] args) {
        printBinary(6, 50);
    }

    /*
     * 15 -> 1111 -> 1 * 2^3 + 1 * 2^2 + 1 * 2^1 + 1 * 2^0
     * 35 -> 100011 -> 2^5 + 2^1 + 2^0
     * 50 -> 110010 -> 2^5 + 2^4 + 2^1
     */
    private static void printBinary(int bits, int value) {
        binaryHelper(bits, "", value);
    }

    private static void binaryHelper(int bits, String soFar, int value) {
        if (bits == 0) {
            if (convertToDecimal(soFar) == value) {
                System.out.println(soFar);
            }
        } else {
            binaryHelper(bits - 1, soFar + "0", value);
            binaryHelper(bits - 1, soFar + "1", value);
        }
    }

    // 110010
    private static int convertToDecimal(String bits) {
        int index = 0;
        int value = 0;
        for (int i = bits.length() - 1; i >= 0; i--) {
            if (bits.charAt(i) == '1') {
                value += Math.pow(2, index);
            }
            index++;
        }
        return value;
    }
}
