package list.test;

import list.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);

        System.out.println(linkedList);
        System.out.println("Size: " + linkedList.getSize());
    }
}
