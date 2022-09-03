package list;

import lombok.ToString;

@ToString
public class LinkedList<T> {
    private Node<T> init;
    private int size = 0;

    public void add(T element) {
        this.init = new Node<>(element);
        this.size++;
    }

    public int getSize() {
        return this.size;
    }
}
