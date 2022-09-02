package queue.labs;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEx2 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Queue<String> priorityQueue = new PriorityQueue<>();

        queue.add("1");
        queue.add("2");
        queue.add("3");
        queue.add("4");
        priorityQueue.add("1P");
        priorityQueue.add("2P");
        priorityQueue.add("3P");
        priorityQueue.add("4P");
        priorityQueue.add("5P");
        queue.add("5");
        queue.add("6");
        queue.add("7");

        while (!queue.isEmpty()) {
            if (!priorityQueue.isEmpty())
                for (int i = 0; i < 3; i++) {
                    System.out.println("\nRemove from priority queue: ");
                    System.out.println(priorityQueue.poll());
                }
            System.out.println("\nRemove from queue: ");
            System.out.println(queue.poll());
        }

        System.out.println("\nRemove from priority queue: ");
        while (!priorityQueue.isEmpty())
            System.out.println(priorityQueue.poll());

    }
}