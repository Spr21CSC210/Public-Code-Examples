package midterm4;

public class Patient implements Comparable<Patient> {

    public final String name;
    public final int priority;

    public Patient(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Patient o) {
        return Integer.compare(this.priority, o.priority);
    }

}