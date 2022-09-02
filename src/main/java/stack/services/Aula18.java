package stack.services;

import stack.data.Stack;

public class Aula18 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        java.util.Stack<Integer> stackNative = new java.util.Stack<>();

        System.out.println(stackNative.isEmpty());

        stackNative.push(1);
        stackNative.push(2);
        stackNative.push(3);

        System.out.println(stackNative.isEmpty());
        System.out.println(stackNative.size());
        System.out.println(stackNative);

        System.out.println(stackNative.peek());
        System.out.println(stackNative);

        System.out.println(stackNative.pop());

        System.out.println(stackNative);

    }
}
