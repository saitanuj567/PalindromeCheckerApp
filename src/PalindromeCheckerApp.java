import java.util.Deque;
import java.util.ArrayDeque;

/**
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 *
 * Use Case 7: Deque-Based Palindrome Check
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded input
        String input = "refer";

        // Create deque
        Deque<Character> deque = new ArrayDeque<>();

        // Add characters to deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        // Compare front and rear
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}