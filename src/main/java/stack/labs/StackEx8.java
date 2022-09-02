package stack.labs;

import java.util.Stack;

public class StackEx8 {
    public static void main(String[] args) {

        Stack<Integer> source = new Stack<>();
        Stack<Integer> aux = new Stack<>();
        Stack<Integer> destination = new Stack<>();

        for (int i = 0; i < 100; i++) {
            source.push(i);
        }

        hanoiTower(source.size(), source, aux, destination);
    }

    public static void hanoiTower(int n, Stack<Integer> source, Stack<Integer> aux, Stack<Integer> destination) {
        if (n > 0) {
            hanoiTower(n - 1, source, destination, aux);
            destination.push(source.pop());
            System.out.println("Move disk " + destination.peek() + " from source " + source.toString() + " to destination " + destination.toString());
            hanoiTower(n - 1, aux, source, destination);
        }

    }


}
