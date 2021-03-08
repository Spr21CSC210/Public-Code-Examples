package midterm3;

import java.util.ArrayList;

public class Generics {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("CS210");
        list.add("Hello World");

        // 1. Annoying casting
        String first = (String) list.get(0);
    }

}