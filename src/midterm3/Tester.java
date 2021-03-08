package midterm3;

public class Tester {

    public static void main(String[] args) {
        GenericBox<String> box = new GenericBox<>();
        box.put("Hello");
        System.out.println(box.get());

        GenericBox<Integer> numbersBox = new GenericBox<>();
        numbersBox.put(67);

    }

}
