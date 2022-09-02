package array.labs;

import array.data.ArrayList;

public class VetorEx3Impl {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<String>();
//
//        list.add("A");
//        list.add("B");
//        list.add("C");
//        list.add("B");
//
//        System.out.println(list);
//        list.remove("B");
//        System.out.println("Removing 'B'");
//        System.out.println(list);

        ArrayList<String> list = new ArrayList<String>(5);

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("B");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("B");
        list.add("E");

        System.out.println(list);
        System.out.println("Removing 'E': " + list.remove("E"));
        System.out.println(list);

        System.out.println("Removing 'B': " + list.remove("B"));
        System.out.println(list);

        System.out.println("Removing 'F': " + list.remove("F"));
        System.out.println(list);

        System.out.println("Removing 'G': " + list.remove("G"));
        System.out.println(list);
    }
}
