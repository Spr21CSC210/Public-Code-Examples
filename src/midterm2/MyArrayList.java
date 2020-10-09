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

    /* Private helper methods */
    private void growArray() {
        int[] newArray = new int[2 * array.length];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public void add(int value) {
        add(size, value);
    }

    /* NO Error Checking. OMG!! XXX */
    public void add(int index, int value) {
        if (size >= array.length) {
            growArray();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
        size++;
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

    /* NO Error Checking. OMG!! XXX */
    public int get(int index) {
        return array[index];
    }

    /* NO Error Checking. OMG!! XXX */
    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
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
