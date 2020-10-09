package midterm2;

public class ListTester {

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        for (int i = 0; i < 15; i++) {
            list.add(i);
        }
        list.remove(1);
        list.add(1, 1);
        MyArrayList anotherList = new MyArrayList(list);
        System.out.println(anotherList);
    }

}
