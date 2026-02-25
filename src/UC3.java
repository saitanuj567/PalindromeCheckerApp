import java.util.Scanner;

public class UseCase3PalindromeCheckerApp {

    static final String APP_NAME = "Palindrome Checker App";
    static final String VERSION = "Version 1.0 - UC3 (String Reverse Method)";

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=======================================");
        System.out.println("        " + APP_NAME);
        System.out.println("        " + VERSION);
        System.out.println("=======================================");

        // Taking user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check palindrome: ");
        String original = scanner.nextLine();

        // Reverse string using for loop
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);   // String concatenation
        }

        // Compare original and reversed string
        if (original.equals(reversed)) {
            System.out.println("Result: The given string is a PALINDROME.");
        } else {
            System.out.println("Result: The given string is NOT a palindrome.");
        }

        scanner.close();
    }
}