package stack.labs;

import java.util.Scanner;
import java.util.Stack;

public class StackEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        System.out.println("The word '" + word + (isThisWordAPalindrome(word) ? "' is a palindrome" : "' is not a palindrome"));
    }

    public static boolean isThisWordAPalindrome(String word) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < word.length(); i++) {
            stack.push(String.valueOf(word.charAt(i)));
        }
        for (int i = 0; i < word.length(); i++) {
            if (!stack.pop().equalsIgnoreCase(String.valueOf(word.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}
