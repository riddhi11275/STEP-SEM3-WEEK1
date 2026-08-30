import java.util.Scanner;

public class PalindromeChecker {


    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }


    public static boolean isPalindromeRecursive(String text) {
        return checkPalindromeRecursively(text, 0, text.length() - 1);
    }

    private static boolean checkPalindromeRecursively(String text, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        return checkPalindromeRecursively(text, start + 1, end - 1);
    }


    public static boolean isPalindromeArrayReversal(String text) {
        char[] originalArray = text.toCharArray();
        char[] reversedArray = new char[originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {
            reversedArray[i] = originalArray[originalArray.length - 1 - i];
        }

        String reversedText = new String(reversedArray);

        return text.equals(reversedText);
    }


    public static void displayResults(String text) {
        boolean iterativeResult = isPalindromeIterative(text);
        boolean recursiveResult = isPalindromeRecursive(text);
        boolean arrayResult = isPalindromeArrayReversal(text);

        System.out.println("\n===== Palindrome Results =====");
        System.out.println("Input Text: " + text);

        System.out.println("Iterative: " +
                (iterativeResult ? "Palindrome" : "Not Palindrome"));

        System.out.println("Recursive: " +
                (recursiveResult ? "Palindrome" : "Not Palindrome"));

        System.out.println("Array Reversal: " +
                (arrayResult ? "Palindrome" : "Not Palindrome"));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String text = scanner.nextLine();

        if (text == null || text.trim().isEmpty()) {
            System.out.println("Invalid input. Please enter a word.");
        } else {
            displayResults(text);
        }

        scanner.close();
    }
}
