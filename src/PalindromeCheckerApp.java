import java.util.Stack;

/**
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 *
 * Use Case 5: Stack-Based Palindrome Check
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded input
        String input = "noon";

        // Create stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome = true;

        // Compare with popped characters
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}