package queue.services;

import queue.data.Queue;

public class Aula20 {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.isEmpty());
        System.out.println(queue.getSize());

        System.out.println(queue);
    }
}
