package array.data;

import java.lang.reflect.Array;
import java.util.function.Consumer;

public class ArrayList<T> {

    private T[] elements;
    private int size;

    public ArrayList(int capacity) {
        this.elements = (T[]) new Object[capacity];
        this.size = 0;
    }

    public ArrayList(int capacity, Class<T> clazz) {
        this.elements = (T[]) Array.newInstance(clazz, capacity);
        this.size = 0;
    }

    public boolean add(T element) {
        this.growCapacity();
        if (this.size < this.elements.length) {
            this.elements[this.size] = element;
            this.size++;
            return true;
        } else {
//            throw new RuntimeException("'Vetor' is full: Not possible to add new elements");
            return false;
        }
    }

    public boolean add(int position, T element) {
        this.growCapacity();
        if (!(position >= 0 && position < this.size)) throw new IllegalArgumentException("Invalid position");
        // move elements to the right
        for (int i = this.size - 1; i >= position; i--) {
            this.elements[i + 1] = this.elements[i];
        }
        this.elements[position] = element;
        this.size++;
        return true;
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; i < this.size; i++) {
            b.append(elements[i]);
            if (!(i == this.size - 1))
                b.append(", ");
        }
        b.append(']');
        return b.toString();
    }

    public T search(int position) {
        if (!(position >= 0 && position < this.size)) throw new IllegalArgumentException("Invalid position");
        return this.elements[position];
    }

    public int search(T element) {
        for (int i = 0; i < this.size; i++) {
            if (this.elements[i].equals(element)) return i;
        }
        return -1;
    }

    private void growCapacity() {
        if (this.size == this.elements.length) {
            T[] newElements = (T[]) new Object[this.elements.length * 2];
            // System.arraycopy(this.elements, 0, newElements, 0, this.elements.length);
            for (int i = 0; i < this.elements.length; i++) {
                newElements[i] = this.elements[i];
            }
            this.elements = newElements;
        }
    }

    public void remove(int position) {
        if (!(position >= 0 && position < this.size))
            throw new IllegalArgumentException("Invalid position");
        for (int i = position; i < this.size - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.size--;
    }

    public boolean remove(T element) {
        int position = this.search(element);
        if (position == -1) return false;
        this.remove(position);
        return true;
    }

    public boolean contains(T element) {
        return search(element) > -1;
    }

    public int lastIndexOf(T element) {
        for (int i = this.size - 1; i >= 0; i--) {
            if (this.elements[i].equals(element)) return i;
        }
        return -1;
    }

    public T get(int position) {
        if (!(position >= 0 && position < this.size)) throw new
                IndexOutOfBoundsException(position + " is an invalid index");
        return this.elements[position];
    }

    public void clear() {
        this.elements = (T[]) new Object[this.elements.length];
        this.size = 0;
    }

    public void forEach(Consumer<T> consumer) {
        for (int i = 0; i < this.size; i++) {
            consumer.accept(this.elements[i]);
        }
    }
}
