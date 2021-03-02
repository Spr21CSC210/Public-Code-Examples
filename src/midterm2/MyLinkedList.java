package midterm2;

public class MyLinkedList {

    private Node front;
    private Node back;

    /* Constructor */
    public MyLinkedList() {
        front = null;
        back = null;
    }

    /* Copy Constructor */
    public MyLinkedList(MyLinkedList copy) {
        // Leave as an exercise
    }

    /*
     * 1. Draw a picture!!
     * 2. Think about the different cases
     * Empty list
     * List with one node
     * A huge list
     * Adding to the very end of the list
     */
    public void add(int value) {
    }

    public void add(int index, int value) {
    }

    public void clear() {
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

    @Override
    public String toString() {
        return "";
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    private class Node {
        private int data;
        private Node next;

        public Node() {
            this(0, null);
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
