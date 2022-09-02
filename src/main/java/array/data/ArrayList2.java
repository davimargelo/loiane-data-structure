package array.data;

import base.StaticStructure;

public class ArrayList2<T> extends StaticStructure<T> {

    public ArrayList2() {
        super();
    }

    public ArrayList2(int capacity) {
        super(capacity);
    }

    public boolean add(T element) {
        return super.add(element);
    }

    public boolean add(int position, T element) {
        return super.add(position, element);
    }
}
