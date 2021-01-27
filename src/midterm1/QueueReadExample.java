package midterm1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueReadExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = 1; i <= 6; i++) {
            queue.add(i);
        }

        for (int i = 0; i < queue.size(); i++) {
            System.out.print(queue.remove() + " ");
        }

        System.out.print(queue);
        System.out.println(" size " + queue.size());
    }
}
