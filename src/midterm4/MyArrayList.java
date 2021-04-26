package midterm4;

import java.util.Iterator;

public class MyArrayList implements Iterable<Integer> {

    private static final int DEFAULT_CAPACITY = 10;

    private int[] array;

    // This is number of elements in our list
    private int size;

    /* Constructor */
    public MyArrayList() {
        size = 0;
        array = new int[DEFAULT_CAPACITY];
    }

    /* Copy Constructor */
    public MyArrayList(MyArrayList copy) {
        this.size = copy.size;
        this.array = new int[this.size];
        for (int i = 0; i < this.size; i++) {
            this.array[i] = copy.array[i];
        }
    }

    private void growArray() {
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < this.size; i++) {
            newArray[i] = array[i];
        }
        this.array = newArray;
    }

    public void add(int value) {
        add(size, value);
    }

    /* TODO: No error checking! */
    public void add(int index, int value) {
        // Add an assert here
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
        this.size = 0;
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

    @Override
    public String toString() {
        String result = "[ ";
        for (int i = 0; i < size; i++) {
            result += array[i] + " ";
        }
        result += "]";
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyArrayList) {
            MyArrayList other = (MyArrayList) obj;
            if (other.size == this.size) {
                for (int i = 0; i < size; i++) {
                    if (other.array[i] != this.array[i]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public Integer next() {
                int value = array[index];
                index += 1;
                return value;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException(
                        "Cannot remove from list");
            }
        };
    }

}
