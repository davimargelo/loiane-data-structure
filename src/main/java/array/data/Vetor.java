package array.data;

public class Vetor {

    private String[] elements;
    private int size;

    public Vetor(int capacity) {
        this.elements = new String[capacity];
        this.size = 0;
    }

//    public void add(String element) {
//        for (int i = 0; i < this.elements.length; i++) {
//            if (this.elements[i] == null) {
//                this.elements[i] = element;
//                break;
//            }
//        }
//    }

    public boolean add(String element) {
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

    public boolean add(int position, String element) {
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
            if (i == this.size - 1) return b.append(']').toString();
            b.append(", ");
        }
        return b.toString();
    }

    public String search(int position) {
        if (!(position >= 0 && position < this.size)) throw new IllegalArgumentException("Invalid position");
        return this.elements[position];
    }

    public int search(String element) {
        for (int i = 0; i < this.size; i++) {
            if (this.elements[i].equals(element)) return i;
        }
        return -1;
    }

    private void growCapacity() {
        if (this.size == this.elements.length) {
            String[] newElements = new String[this.elements.length * 2];
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
