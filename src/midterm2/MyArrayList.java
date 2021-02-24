package midterm2;

public class MyArrayList {

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
        if (size >= array.length) {
            growArray();
        }
        array[size] = value;
        this.size += 1;
    }

    public void add(int index, int value) {
    }

    public void clear() {
        this.size = 0;
    }

    public boolean contains(int value) {
        return false;
    }

    public int get(int index) {
        return 0;
    }

    public void remove(int index) {
    }

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    /* toString */
    @Override
    public String toString() {
        return "";
    }

    /* equals */
    @Override
    public boolean equals(Object obj) {
        return false;
    }

}
