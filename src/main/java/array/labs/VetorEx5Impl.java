package array.labs;

import array.data.ArrayList;

public class VetorEx5Impl {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(5);

        System.out.println(list);

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println(list);
        System.out.println("Cleaning "+ list.getSize() + " elements");
        list.clear();
        System.out.println(list);
        System.out.println(list.getSize());

        list.add("A");
        list.add("B");

        System.out.println(list);
    }
}
