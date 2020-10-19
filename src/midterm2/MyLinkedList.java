package midterm2;

public class MyLinkedList {

    private ListNode front;

    /* Constructor */
    public MyLinkedList() {
        front = null;
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
            front = new ListNode(value);
        } else {
            ListNode current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(value);
        }
    }

    /* NO Error Checking. OMG!! XXX */
    public void add(int index, int value) {

    }

    public void clear() {
        front = null;
    }

    public boolean contains(int value) {
        ListNode current = front;
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /* NO Error Checking. OMG!! XXX */
    public int get(int index) {
        ListNode current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    /* NO Error Checking. OMG!! XXX */
    public void remove(int index) {

    }

    /* XXX Make this a constant time method. */
    public int size() {
        ListNode current = front;
        int size = 0;
        while (current != null) {
            size += 1;
            current = current.next;
        }
        return size;
    }

    public boolean isEmpty() {
        return front == null;
    }

    /* toString */
    @Override
    public String toString() {
        String result = "[ ";
        ListNode current = front;
        while (current != null) {
            result += current.data + " ";
            current = current.next;
        }
        result += " ]";
        return result;
    }

    /* equals */
    @Override
    public boolean equals(Object obj) {
        return false;
    }

    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data, ListNode next) {
            this.data = data;
            this.next = next;
        }

        public ListNode(int data) {
            this(data, null);
        }

        public ListNode() {
            this(0, null);
        }
    }
}
