package stack.labs;

import java.util.Scanner;
import java.util.Stack;

public class StackEx1 {
    public static void main(String[] args) {
        Stack<Integer> evenStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            Integer number = scanNumber(scanner);
            System.out.println("Analizing number: " + number);
            if (number % 2 == 0) {
                System.out.println("Number " + number + " is even");
                evenStack.push(number);
            }
            else {
                System.out.println("Number " + number + " is odd");
                if (evenStack.isEmpty())
                    System.out.println("But stack is empty");
                else {
                    System.out.println("Popping element: " + evenStack.pop());
                }
            }
            System.out.println("Current Stack: " + evenStack + "\n");
        }

        if (!evenStack.isEmpty()) {
            System.out.println("Stack is not empty");
            System.out.println(evenStack);
            System.out.println("Cleaning trash");
            evenStack.clear();
        }
        System.out.println(evenStack);
    }

    protected static Integer scanNumber(Scanner scanner) {
        try {
            System.out.println("Enter number: ");
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
            return scanNumber(scanner);
        }
    }
}
