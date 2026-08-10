/*
6. An e-commerce cart system calculates the total bill using a method calculateTotal() that should work whether the customer buys a single item, multiple items of the same type, or applies a discount. Write a Java program demonstrating method overloading for this scenario.
*/
class Q6 {
    static class Cart {
        void calculateTotal(int price) {
            System.out.println("Total bill: ₹" + price);
        }

        void calculateTotal(int price, int quantity) {
            System.out.println("Total bill: ₹" + (price * quantity));
        }
        void calculateTotal(int price, int quantity, double discount) {
            double total = price * quantity;
            double discounted = total - (total * discount / 100);
            System.out.println("Total bill after discount: ₹" + discounted);
        }
    }

    public static void main(String[] args) {
        Cart cart = new Cart();

        cart.calculateTotal(500);
        cart.calculateTotal(200, 3);
        cart.calculateTotal(200, 3, 10);
    }
}
