package stack.services;

import stack.data.Stack;

public class Aula14 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 15; i++) {
            stack.push(i);
        }
        System.out.println("Stack: " + stack);
        System.out.println("Stack size: " + stack.getSize());
    }
}
