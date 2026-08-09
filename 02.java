import java.util.Scanner;

class BookFine {
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
