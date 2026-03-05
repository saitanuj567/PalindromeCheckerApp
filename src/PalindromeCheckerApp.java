public class PalindromeCheckerApp{

    public static void main(String[] args) {

        String input = "level";

        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.check(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}

/**
 * Strategy interface for palindrome validation
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * This class provides a Stack based implementation
 * of the PalindromeStrategy interface.
 * It uses LIFO behavior to reverse characters
 * and compare them with the original sequence.
 */
class StackStrategy implements PalindromeStrategy {

    /**
     * Implements palindrome validation using Stack
     */
    public boolean check(String input) {

        // Create stack to store characters
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push each character of input string onto stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from stack
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}