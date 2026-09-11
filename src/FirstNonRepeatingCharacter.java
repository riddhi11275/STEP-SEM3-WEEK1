import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    public static char findFirstNonRepeatingCharacter(String text) {
        for (int i = 0; i < text.length(); i++) {
            char currentCharacter = text.charAt(i);
            int count = 0;

            for (int j = 0; j < text.length(); j++) {
                if (currentCharacter == text.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                return currentCharacter;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        char result = findFirstNonRepeatingCharacter(text);

        if (result == '\0') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("First non-repeating character: " + result);
        }

        scanner.close();
    }
}