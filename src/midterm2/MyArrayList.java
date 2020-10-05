package midterm2;

public class MyArrayList {

    private static final int DEFAULT_CAPACITY = 10;

    private int[] array;
    private int size;

    /* Constructor */
    public MyArrayList() {
        array = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    /* Copy Constructor */
    public MyArrayList(MyArrayList copy) {
        array = new int[copy.array.length];
        size = copy.size;
        for (int i = 0; i < size; i++) {
            array[i] = copy.array[i];
        }
    }

    public void add(int value) {
        array[size] = value;
        size += 1;
    }

    public void add(int index, int value) {

    }

    public void clear() {
        size = 0;
    }

    public boolean contains(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public int get(int index) {
        return array[index];
    }

    public void remove(int index) {

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /* toString */
    @Override
    public String toString() {
        String result = "[ ";
        for (int i = 0; i < size; i++) {
            result += array[i] + " ";
        }
        result += "]";
        return result;
    }

    /* equals */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyArrayList) {
            MyArrayList list = (MyArrayList) obj;
            if (size == list.size) {
                for (int i = 0; i < size; i++) {
                    if (array[i] != list.array[i]) {
                        return false;
                    }
                }
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
