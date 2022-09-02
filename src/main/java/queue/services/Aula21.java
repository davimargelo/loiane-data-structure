package queue.services;

import queue.data.Queue;

public class Aula21 {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();
        queue.enqueue("3");
        queue.enqueue("1");
        queue.enqueue("2");

        System.out.println(queue.peek());
        System.out.println(queue);
    }
}
