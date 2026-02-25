/**
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 *
 * Use Case 4: Character Array Based Palindrome Check
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // ⭐ Hardcoded string
        String input = "madam";

        // ⭐ Convert to character array
        char[] chars = input.toCharArray();

        boolean isPalindrome = true;

        // ⭐ Compare characters from both ends
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        // ⭐ Display result
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}