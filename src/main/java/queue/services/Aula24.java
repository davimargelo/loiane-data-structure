package queue.services;

import queue.data.PriorityQueue;

public class Aula24 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.enqueue(1);
        pq.enqueue(3);
        pq.enqueue(2);

        System.out.println(pq);
    }
}
