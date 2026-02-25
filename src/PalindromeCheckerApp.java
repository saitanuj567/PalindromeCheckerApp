public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";   // hardcoded string
        String reversed = "";

        // reverse string
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // compare original and reversed
        boolean isPalindrome = input.equals(reversed);

        // display result
        System.out.println("Input text: " + input);
        System.out.println("Reversed text: " + reversed);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}