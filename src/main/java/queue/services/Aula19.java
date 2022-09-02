package queue.services;

import queue.data.Queue;

public class Aula19 {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        System.out.println(queue.isEmpty());
        System.out.println(queue.getSize());
    }
}
