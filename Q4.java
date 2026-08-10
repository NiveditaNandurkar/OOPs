/*
4. A banking application needs to transfer money between two Account objects by passing one account object as a parameter to a method in another account object. Write a Java program to implement this transfer, checking for sufficient balance.
*/
class Q4 {
    static class Account {
        String name;
        int balance;
        Account(String name, int balance) {
            this.name = name;
            this.balance = balance;
        }

        void transfer(Account receiver, int amount) {
            if (amount > this.balance) {
                System.out.println("Insufficient balance in " + this.name + "'s account.");
                return;
            }

            this.balance -= amount;
            receiver.balance += amount;
            System.out.println("Transferred ₹" + amount + " from " + this.name + " to " + receiver.name);
            System.out.println(this.name + " balance: ₹" + this.balance);
            System.out.println(receiver.name + " balance: ₹" + receiver.balance);
        }
    }

    public static void main(String[] args) {
        Account a1 = new Account("Alice", 5000);
        Account a2 = new Account("Bob", 3000);

        a1.transfer(a2, 2000);
    }
}
