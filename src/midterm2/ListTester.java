package midterm2;

import java.util.LinkedList;
import java.util.List;

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


    public static void exampleFunction(int N) {
        List<Integer> list = new LinkedList<Integer>();
        for (int x = 1; x <= N; x++) {
            list.add(0, x);
        }
        while (!list.isEmpty()) {
            list.remove(0);
        }
    }

}
