/**
 * MAIN CLASS - UseCase2PalindromeCheckerApp
 *
 * Use Case 2: Hardcoded Palindrome Validation
 */

public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        // ⭐ Hardcoded string
        String input = "madam";

        boolean isPalindrome = true;

        // ⭐ Loop till half of string length
        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // ⭐ Print result
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}