package queue.labs;

import queue.data.Doc;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx1 {
    public static void main(String[] args) {
        Queue<Doc> queue = new LinkedList<>();

        queue.add(new Doc("Java", "200"));
        queue.add(new Doc("C++", "300"));
        queue.add(new Doc("C#", "400"));
        queue.add(new Doc("Python", "500"));
        queue.add(new Doc("JavaScript", "600"));

        while(!queue.isEmpty()) {
            Doc doc = queue.poll();
            System.out.println(doc.getName() + " " + doc.getPages());
        }

        System.out.println(queue);
    }
}
