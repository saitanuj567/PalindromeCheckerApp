import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

/**
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 *
 * Use Case 6: Queue + Stack Based Palindrome Check
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // ⭐ Hardcoded input
        String input = "civic";

        // ⭐ Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // ⭐ Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // ⭐ Insert characters into both
        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;

        // ⭐ Compare until queue empty
        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // ⭐ Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}