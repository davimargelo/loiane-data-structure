package stack.services;

import stack.data.Stack;

public class Aula16 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        System.out.println(stack.peek());

        stack.push("A");
        stack.push("B");

        System.out.println(stack.peek());
        System.out.println(stack);
    }
}
