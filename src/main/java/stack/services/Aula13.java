package stack.services;

import stack.data.Stack;

public class Aula13 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        System.out.println("Pushing 1, 2, 3, 4, 5");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Stack: " + stack);
        System.out.println("Stack size: " + stack.getSize());
    }
}
