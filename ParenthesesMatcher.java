import java.util.Stack;

public class ParenthesesMatcher {
    public static void main(String[] args) {
        String expression = "(a + b) * (c - d)"; // You can change this string

        if (isBalanced(expression)) {
            System.out.println("The parentheses are balanced.");
        } else {
            System.out.println("The parentheses are NOT balanced.");
        }
    }

    public static boolean isBalanced(String expr) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);

            // Push opening brackets
            if (ch == '(') {
                stack.push(ch);
            }

            // For closing brackets, check if there's a matching opening
            else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false; // No matching opening bracket
                } else {
                    stack.pop(); // Matched pair
                }
            }
        }

        // If stack is empty, all parentheses were matched
        return stack.isEmpty();
    }
}
