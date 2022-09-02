package stack.data;

import base.StaticStructure;

public class Stack<T> extends StaticStructure<T> {
    public Stack() {
        super();
    }

    public Stack(int capacity) {
        super(capacity);
    }

    public boolean push(T element) {
        return super.add(element);
    }

    public T peek() {
        if (super.isEmpty()) return null;
        return super.elements[super.size - 1];
    }

    public T pop() {
        if (super.isEmpty()) return null;
        return super.elements[--super.size];
    }

//    TODO
//    public T pop() {
//        return super.remove(super.size() - 1);
//    }
}
