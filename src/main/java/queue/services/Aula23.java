package queue.services;

import java.util.LinkedList;
import java.util.Queue;

public class Aula23 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue);
    }
}
