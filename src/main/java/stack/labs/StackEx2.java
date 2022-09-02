package stack.labs;

import java.util.Scanner;
import java.util.Stack;

public class StackEx2 extends StackEx1 {
    public static void main(String[] args) {
        Stack<Integer> evenStack = new Stack<>();
        Stack<Integer> oddStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            Integer number = scanNumber(scanner);
            System.out.println("Analizing number: " + number);

            if (number == 0) {
                System.out.println("Popping for each stack -" +
                        " Even: " + (evenStack.isEmpty() ? "is empty" : evenStack.pop()) +
                        " Odd: " + (oddStack.isEmpty() ? "is empty" : oddStack.pop()));
            } else if (number % 2 == 0) {
                System.out.println("Number " + number + " is even");
                evenStack.push(number);
            } else {
                System.out.println("Number " + number + " is odd");
                oddStack.push(number);
            }

        }

        System.out.println("Cleanning trash from even stack");
        while (!evenStack.isEmpty()) {
            System.out.println("Popping element: " + evenStack.pop());
        }
        System.out.println("\n");
        System.out.println("Cleanning trash from odd stack");
        while (!oddStack.isEmpty()) {
            System.out.println("Popping element: " + oddStack.pop());
        }
    }
}
