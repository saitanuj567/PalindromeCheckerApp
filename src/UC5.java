<<<<<<< HEAD
import java.util.Scanner;

 class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert string to character array
        char[] characters = input.toCharArray();

        // Two pointer technique
        int start = 0;
        int end = characters.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Output result
        if (isPalindrome) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        sc.close();
=======
class UC5 {
}
import java.util.Scanner;
import java.util.Stack;

 class UseCase5PalindromeCheckerApp {

    static final String APP_NAME = "Palindrome Checker App";
    static final String VERSION = "Version 1.0 - UC5 (Stack Method)";

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=======================================");
        System.out.println("        " + APP_NAME);
        System.out.println("        " + VERSION);
        System.out.println("=======================================");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check palindrome: ");
        String input = scanner.nextLine();

        // Create Stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Pop characters and build reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Compare original and reversed string
        if (input.equals(reversed)) {
            System.out.println("Result: The given string is a PALINDROME.");
        } else {
            System.out.println("Result: The given string is NOT a palindrome.");
        }

        scanner.close();
>>>>>>> bb70d5e9835730e1b59c3ca280fa87aac2620e5e
    }
}