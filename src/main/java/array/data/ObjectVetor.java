package array.data;

public class ObjectVetor {

    private Object[] elements;
    private int length;

    public ObjectVetor(int capacity) {
        this.elements = new Object[capacity];
        this.length = 0;
    }

    public boolean add(Object element) {
        this.growCapacity();
        if (this.length < this.elements.length) {
            this.elements[this.length] = element;
            this.length++;
            return true;
        } else {
//            throw new RuntimeException("'Vetor' is full: Not possible to add new elements");
            return false;
        }
    }

    public boolean add(int position, Object element) {
        this.growCapacity();
        if (!(position >= 0 && position < this.length)) throw new IllegalArgumentException("Invalid position");
        // move elements to the right
        for (int i = this.length - 1; i >= position; i--) {
            this.elements[i + 1] = this.elements[i];
        }
        this.elements[position] = element;
        this.length++;
        return true;
    }

    public int getLength() {
        return this.length;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; i < this.length; i++) {
            b.append(elements[i]);
            if (i == this.length - 1) return b.append(']').toString();
            b.append(", ");
        }
        return b.toString();
    }

    public Object search(int position) {
        if (!(position >= 0 && position < this.length)) throw new IllegalArgumentException("Invalid position");
        return this.elements[position];
    }

    public int search(Object element) {
        for (int i = 0; i < this.length; i++) {
            if (this.elements[i].equals(element)) return i;
        }
        return -1;
    }

    private void growCapacity() {
        if (this.length == this.elements.length) {
            Object[] newElements = new Object[this.elements.length * 2];
            // System.arraycopy(this.elements, 0, newElements, 0, this.elements.length);
            for (int i = 0; i < this.elements.length; i++) {
                newElements[i] = this.elements[i];
            }
            this.elements = newElements;
        }
    }

    public void remove(int position) {
        if (!(position >= 0 && position < this.length))
            throw new IllegalArgumentException("Invalid position");
        for (int i = position; i < this.length - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.length--;
    }
}
