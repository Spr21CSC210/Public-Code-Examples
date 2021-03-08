package midterm3;

public class GenericBox<T> {

    private T item;

    public GenericBox() {
        item = null;
    }

    public void put(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }

}
