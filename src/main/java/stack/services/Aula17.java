package stack.services;

import stack.data.Stack;

public class Aula17 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack);

        System.out.println("Pop element: " + stack.pop());
        System.out.println(stack);
    }
}
