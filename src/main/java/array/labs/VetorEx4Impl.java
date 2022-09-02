package array.labs;

import array.data.ArrayList;

public class VetorEx4Impl {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(5);

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println(list);

        System.out.println("Getting index 0: " + list.get(0));
        System.out.println("Getting index 1: " + list.get(1));
        System.out.println("Getting index 2: " + list.get(2));
        System.out.println("Getting index 3: " + list.get(3));
        System.out.println("Getting index 4: " + list.get(4));
        System.out.println("Getting index 5: " + list.get(5));
    }
}
