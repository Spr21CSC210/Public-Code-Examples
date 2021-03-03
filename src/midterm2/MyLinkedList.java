package midterm2;

public class MyLinkedList {

    private Node front;
    private Node back;
    private int size;

    /* Constructor */
    public MyLinkedList() {
        front = null;
        back = null;
        size = 0;
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
        if (front == null) {
            front = new Node(value, null);
            back = front;
        } else {
            back.next = new Node(value, null);
            back = back.next;
        }
        size += 1;
    }

    public void add(int index, int value) {
    }

    public void clear() {
        front = null;
        back = null;
        size = 0;
    }

    public boolean contains(int value) {
        Node curr = front;
        while (curr != null) {
            if (curr.data == value) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public int get(int index) {
        Node curr = front;
        for (int i = 0; i < index; i++) {
            curr = front.next;
        }
        return curr.data;
    }

    public void remove(int index) {
    }

    public int size() {
        return size;
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
        if (obj instanceof MyLinkedList) {
            MyLinkedList other = (MyLinkedList) obj;
            if (this.size == other.size) {
                for (int i = 0; i < size; i++) {
                    if (this.get(i) != other.get(i)) {
                        return false;
                    }
                }
                return true;
            }
        }
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
