package queue.services;

import java.util.PriorityQueue;
import java.util.Queue;

public class Aula25 {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(2);
        pq.add(3);
        pq.add(1);

        Integer i;
        while ((i = pq.poll())!= null) System.out.print(i + " ");
    }
}
