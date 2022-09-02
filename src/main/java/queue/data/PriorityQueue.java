package queue.data;

public class PriorityQueue<T> extends Queue<T> {

    public PriorityQueue() {
        super();
    }

    public PriorityQueue(int capacity) {
        super(capacity);
    }

    public void enqueue(T element) {

        if (isEmpty()) {
            super.enqueue(element);
            return;
        }

        for (int i = 0; i < getSize(); i++) {
            if (element.toString().compareTo(super.elements[i].toString()) < 0) {
                super.add(i, element);
                return;
            }
        }

        super.enqueue(element);
    }
}
