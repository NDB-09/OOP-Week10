import java.util.*;

public class ListKLTN<E extends Comparable<E>> {
    private List<E> items = new ArrayList<>();

    public void add(E item) {
        items.add(item);
    }

    public void print() {
        Collections.sort(items);
        for (E item : items) {
            System.out.println(item);
        }
    }
}