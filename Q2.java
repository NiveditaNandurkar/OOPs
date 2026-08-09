/*
2. A library issues a fine of ₹5 per day for books returned after the due date. Write a Java program to calculate the fine based on the number of days late, using conditional statements.
*/
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of days late: ");
        int daysLate = sc.nextInt();

        int fine = 0;
        if (daysLate > 0) {
            fine = daysLate * 5;
            System.out.println("Fine amount: ₹" + fine);
        } else {
            System.out.println("No fine. Book returned on time.");
        }

        sc.close();
    }
}
