package midterm4;

import java.util.PriorityQueue;

public class PQExample {

    public static void main(String[] args) {
        Patient tyler = new Patient("Tyler", 1);
        Patient lauren = new Patient("Lauren", 6);
        Patient hanna = new Patient("Hanna", 3);

        PriorityQueue<Patient> pq = new PriorityQueue<Patient>();
        pq.add(lauren);
        pq.add(hanna);
        pq.add(tyler);

        while (!pq.isEmpty()) {
            System.out.println(pq.remove().name);
        }
    }

}
