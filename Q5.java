/*
5. A ride-sharing app assigns the same driver object to two different trip bookings. Write a Java program to demonstrate that changing the driver's status (available/busy) through one booking reference reflects in the other.
*/
class Q5 {
    static class Driver {
        String status;

        Driver(String status) {
            this.status = status;
        }
    }

    static class Booking {
        Driver driver;

        Booking(Driver driver) {
            this.driver = driver;
        }

        void setDriverStatus(String status) {
            this.driver.status = status;
        }
    }

    public static void main(String[] args) {
        Driver driver = new Driver("Available");
        Booking booking1 = new Booking(driver);
        Booking booking2 = new Booking(driver);

        System.out.println("Initial driver status: " + booking1.driver.status);

        booking1.setDriverStatus("Busy");

        System.out.println("Status through booking1: " + booking1.driver.status);
        System.out.println("Status through booking2: " + booking2.driver.status);
    }
}
