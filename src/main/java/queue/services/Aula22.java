package queue.services;

import queue.data.Queue;

public class Aula22 {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<String>();
        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");
        queue.enqueue("4");
        queue.enqueue("5");
        System.out.println(queue);

        while (!queue.isEmpty()) {
            System.out.println("dequeuing: " + queue.dequeue());
            System.out.println(queue);
        }
    }
}
