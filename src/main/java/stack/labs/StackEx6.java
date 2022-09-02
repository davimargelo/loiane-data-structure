package stack.labs;

import java.util.Stack;

public class StackEx6 {
    public static void main(String[] args) {
        System.out.println("Equation: (3 + 2) * (5 - 1): " + isWithParenthesesCorrect("(3 + 2) * (5 - 1)"));
        System.out.println("Equation: (32 - 24(5 + 1): " + isWithParenthesesCorrect("(32 - 24(5 + 1)"));
        System.out.println("Equation: ([32 - 24])(5 + 1): " + isWithParenthesesCorrect("([32 - 24])(5 + 1)"));
        System.out.println("Equation: ([3 + 2)] * (5 - 1): " + isWithParenthesesCorrect("([3 + 2)] * (5 - 1)"));
        System.out.println("Equation: ([}3 + 2]) * (5 - 1): " + isWithParenthesesCorrect("([}3 + 2]) * (5 - 1)"));
        System.out.println("Equation: 43]: " + isWithParenthesesCorrect("43]"));
    }

    public static boolean isWithParenthesesCorrect(String s) {
        String OPEN_PARENTHESES = "([{";
        String CLOSE_PARENTHESES = ")]}";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (OPEN_PARENTHESES.indexOf(c) != -1) {
                stack.push(c);
            } else if (CLOSE_PARENTHESES.indexOf(c) != -1) {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.pop();
                    if (OPEN_PARENTHESES.indexOf(top) != CLOSE_PARENTHESES.indexOf(c)) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
