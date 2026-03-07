/**
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 *
 * Use Case 10: Case-Insensitive & Space-Ignored Palindrome Check
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded input
        String input = "A man a plan a canal Panama";

        // Normalize string (remove spaces + lowercase)
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {

            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}