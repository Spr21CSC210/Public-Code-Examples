package midterm3;

public class MyLinkedList<E> implements MyList<E> {

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
    public MyLinkedList(MyLinkedList<E> copy) {
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
    public void add(E value) {
        if (front == null) {
            front = new Node(value, null);
            back = front;
        } else {
            back.next = new Node(value, null);
            back = back.next;
        }
        size += 1;
    }

    public void add(int index, E value) {
    }

    public void clear() {
        front = null;
        back = null;
        size = 0;
    }

    public boolean contains(E value) {
        Node curr = front;
        while (curr != null) {
            if (curr.data.equals(value)) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public E get(int index) {
        Node curr = front;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
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
            MyLinkedList<E> other = (MyLinkedList<E>) obj;
            if (this.size == other.size) {
                for (int i = 0; i < size; i++) {
                    if (!this.get(i).equals(other.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private class Node {
        private E data;
        private Node next;

        public Node() {
            this(null, null);
        }

        public Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    @Override
    public int indexOf(E value) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void set(int index, E value) {
        // TODO Auto-generated method stub

    }
}
