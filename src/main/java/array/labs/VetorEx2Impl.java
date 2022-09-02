package array.labs;

import array.data.ArrayList;

public class VetorEx2Impl {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(5);

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("B");

        System.out.println(list.lastIndexOf("C"));
        System.out.println(list.lastIndexOf("B"));
        System.out.println(list.lastIndexOf("E"));
        System.out.println(list.lastIndexOf("A"));
    }
}
