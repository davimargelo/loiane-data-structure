package queue.data;

import base.StaticStructure;

public class Queue<T> extends StaticStructure<T> {

    public Queue() {
        super();
    }

    public Queue(int capacity) {
        super(capacity);
    }

    public void enqueue(T item) {
        super.add(item);
    }

    public T peek() {
        if (this.isEmpty()) {
            return null;
        }
        return this.elements[0];
    }

    public T dequeue() {
        if (this.isEmpty()) {
            return null;
        }
        T item = this.elements[0];
        this.remove(0);
        return item;
    }
}
