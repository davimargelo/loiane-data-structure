package base;

public class StaticStructure<T> {
    protected T[] elements;
    protected int size;

    public StaticStructure(int capacity) {
        this.elements = (T[]) new Object[capacity];
        this.size = 0;
    }

    public StaticStructure() {
        this(10);
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    protected boolean add(T element) {
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

    protected boolean add(int position, T element) {
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

    @SuppressWarnings({"unchecked", "DuplicatedCode"})
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
}
