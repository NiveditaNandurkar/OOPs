/*An ATM machine needs to display whether a customer entered a valid 4-digit PIN. Write
a Java program using loops and conditional constructs to validate the PIN (must be
exactly 4 digits, numeric only).*/
import java.util.Scanner;

class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 4-digit PIN: ");
        String pin = sc.nextLine();

        boolean isValid = true;

        // Check length
        if (pin.length() != 4) {
            isValid = false;
        } else {
            // Check each character is a digit
            for (int i = 0; i < pin.length(); i++) {
                if (!Character.isDigit(pin.charAt(i))) {
                    isValid = false;
                    break;
                }
            }
        }

        // Display result
        if (isValid) {
            System.out.println("Valid PIN entered.");
        } else {
            System.out.println("Invalid PIN. Must be exactly 4 digits and numeric only.");
        }

        sc.close();
    }
}
