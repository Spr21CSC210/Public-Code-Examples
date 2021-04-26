package midterm4;

public class ListTester {

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(6);
        list.add(7);
        list.add(10);

        for (int number : list) {
            System.out.println(number);
        }
    }

}
