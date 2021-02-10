package midterm1;

import java.util.List;

/*
 * This file lists SEVERAL big Oh examples. Thanks to the UGTAs who provided examples:
 * Brandon Kaplan, Christian Capriotti, Emily Savarese, Jasur Jiasuer, Molly Opheim, Sam Cox,
 * and Taylor Romero.
 * 
 * Each problem is commented with which number problem it is so discussing on piazza will be easier and
 * what level difficulty it is. Note that some problems are more difficult than I would include on the
 * first exam, but useful for the future! I would hope you are comfortable with the problems categorized
 * as 'Manageable'. 'Medium' is starting to push it, those are a little difficult for what should be on the
 * test. 'Difficult' is beyond anything we would see on this first exam, those are simply challenge problems.
 * 
 * Answers are shown in a comment below the method.
 */

public class BigO {

    /*
     * 1
     * Difficult
     */
    private static int bigOhExample(int[] arr) {
        int numsFound = 0;
        for (int i = 0; i < arr.length; i++) {
            numsFound += innerFunc(arr, 0, arr.length, i);
        }
        return numsFound;
    }
    private static int innerFunc(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return 1;
            if (arr[mid] > x)
                return innerFunc(arr, l, mid - 1, x);
            return innerFunc(arr, mid + 1, r, x);
        }
        return 0;
    }
    /*
     * nlog(n)
     * innerFunc is a binary search which runs in log(n) time. This binary
     * search is run n times. n is the number of elements in arr
     */


    /*
     * 2
     * Manageable
     */
    public static void arrayConfusion(int[] array) {
        for (int index = 1; index < array.length; index += 1) {
            int key = array[index];
            int second = index - 1;
            while (second >= 0 && array[second] > key) {
                array[second + 1] = array[second];
                second = second - 1;
            }
            array[second + 1] = key;
        }
    }
    /*
     * O(n^2)
     */

    /*
     * 3
     * Manageable
     */
    public static int integerDivision(int a, int b) {
        int i = 0;
        int sum = b;
        while (sum <= a) {
            sum += b;
            i++;
        }
        return i;
    }
    /*
     * O(a/b)
     * Remember that big O is an expression to show how the runtime
     * varies depending on the inputs to your program. So it doesn't always
     * have to be n.
     */

    /*
     * 4
     * Manageable
     */
    public static void method(String[] args) {
        int someSize = 120;
        //This loop just takes N amount of times, since its just looping
        for (int i = 0; i < someSize; i++) {
            System.out.println("We're doing some task!");
        }

        //This loop within a loop is n^2, since we're printing n times... n times
        for (int i = 0; i < someSize; i++) {
            for (int j = 0; j < someSize; j++) {
                System.out.println("What would the big O be?");
            }
        }

        //But the total value of this whole method is JUST O(n^2), since we don't really care about smaller values.
        //Similarly, if we wanted to add a few more lines of code...

        System.out.println("Hello!");
        System.out.println("Foo!");
        System.out.println("Bar!");

        //NOW this whole method runs in O(n^2 + n + 3) time, but we want to just be concerned about the largest term!
    }
    /*
     * O(n^2)
     * We only care about the highest order terms in big O calculations.
     */


    /*
     * 5
     * Manageable
     */
    public void firstExample(List<Integer> list) {
        for(Integer item: list) {
            for(int i = list.size() - 1; i >=0; i = i/2) {
                // Some O(1) operation
            }
        }
    }
    /*
     * O(nlog(n))
     * The for-each loop runs n times. The inner for loop continually
     * divides i by 2. When you repeatedly divide by 2, you end up with
     * logarithmic runtimes. These are often seen when dealing with BSTs
     * for instance. Run through this example in your head with a list of
     * a certain size, say 100 elements.
     */

    
    /*
     * 6
     * Manageable
     */
    public void secondExample(List<Integer> list) {
        for(Integer item: list) {
            for(int i = 100000; i >=0; i = i/2) {
                //Some O(1) operation
            }
        }
    }
    /*
     * O(N)
     */



    /*
     * 7
     * Manageable
     */
    public static void methodA(int bigNum) {
        for(int i = 0; i < bigNum; i++) {
            for(int j = i +1; j < bigNum; j++) {
                System.out.println("i val is " + i + "j val is " + j);
            }
        }
    }
    /*
     * O(N^2)
     * This is a nice example because it shows that the variable doesn't always
     * have to be named 'N'. These runtime efficiencies are only meant to denote
     * how the runtime changes based on the input(s) to the method or program.
     */


    /*
     * 8
     * Manageable
     */
    static void problem1() {
        int[] arrOne = { 1, 2, 3, 4 };  
        int[] arrTwo = { 2, 3, 4, 5, 6, 7, 8, 9 };

        for (int i = 0; i < arrOne.length; i++) {
            for (int j = 0; j < arrTwo.length; j++) {
                for (int k = 0; k < 50000000; k++) { 
                    System.out.println(arrOne[i] + " :: " + arrTwo[j]);
                }
            }
        }

    }
    /*
     * O(N*M), where N is the length of arrOne and M is the length of arrTwo
     * 
     * The runtime efficiency can also depend on multiple inputs!
     */



    /*
     * 9
     * Manageable
     */
    static void problem2() {

        int[] arrOne = { 1, 2, 3, 4 };  
        int[] arrTwo = { 2, 3, 4, 5, 6, 7, 8, 9 };

        for (int i = 0; i < arrOne.length; i++) {
            System.out.println(arrOne[i]);
        }

        for (int j = 0; j < arrTwo.length; j++) {
            System.out.println(arrTwo[j]);
        }   

    }
    /*
     * O(N+M)
     */



    /*
     * 10
     * Manageable/Medium
     */
    static int fact(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
    /*
     * O(N)
     * This will recurse n times before giving the correct value.
     */


}
