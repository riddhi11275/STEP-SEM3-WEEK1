import java.util.Scanner;

public class TypingSpeedTestAccuracyChecker {

    public static void checkTypingAccuracy(String original, String typed) {

        int matchedCharacters = 0;
        int firstMismatchPosition = -1;

        int length = Math.min(original.length(), typed.length());

        for (int i = 0; i < length; i++) {

            if (original.charAt(i) == typed.charAt(i)) {
                matchedCharacters++;
            } else if (firstMismatchPosition == -1) {
                firstMismatchPosition = i;
            }
        }

        int totalCharacters = Math.max(original.length(), typed.length());

        if (original.length() != typed.length()) {
            firstMismatchPosition = length;
        }

        double accuracy = (matchedCharacters * 100.0) / totalCharacters;

        System.out.printf(
                "Matched: %d/%d | Accuracy: %.2f%%",
                matchedCharacters,
                totalCharacters,
                accuracy
        );

        if (firstMismatchPosition == -1) {
            System.out.println(" | No Mismatches");
        } else {
            System.out.println(" | First Mismatch at position "
                    + (firstMismatchPosition + 1));
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter original passage: ");
        String original = scanner.nextLine();

        System.out.print("Enter typed passage: ");
        String typed = scanner.nextLine();

        checkTypingAccuracy(original, typed);

        scanner.close();
    }
}
