import java.util.Scanner;

public class ReverseCustomerName {

    public static String reverseName(String name) {
        String reversedName = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            reversedName = reversedName + name.charAt(i);
        }

        return reversedName;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        if (customerName.trim().isEmpty()) {
            System.out.println("Name cannot be empty.");
        } else {
            String reversedName = reverseName(customerName);
            System.out.println("Reversed customer name: " + reversedName);
        }

        scanner.close();
    }
}
