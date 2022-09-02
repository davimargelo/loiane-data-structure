package stack.labs;


import java.util.Stack;

public class StackEx7 {
    public static void main(String[] args) {
        System.out.println(decimalToBase(10, 2));
        System.out.println(decimalToBase(100, 2));
        System.out.println(decimalToBase(1000, 2));
        System.out.println(decimalToBase(28, 2));
    }

    public static String decimalToBase(int n, int base) {
        if (base < 2 || base > 16) {
            throw new IllegalArgumentException("Base must be >= 2 and <= 16");
        }

        String baseSequence = "0123456789ABCDEF";

        Stack<Integer> stack = new Stack<>();
        while (n > 0) {
            stack.push(n % base);
            n /= base;
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty())
            result.append(baseSequence.charAt(stack.pop()));

        return String.valueOf(result);
    }
}
