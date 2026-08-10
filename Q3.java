/*
3. A company initializes its tax rate only once when the program starts, regardless of how many Employee objects are created. Write a Java program using a static block to set this common tax rate.
*/
class Q3 {
    static int taxRate;

    static {
        taxRate = 18;
        System.out.println("Static block executed: tax rate initialized to " + taxRate + "%");
    }
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        System.out.println("Tax rate used by employee 1: " + taxRate + "%");
        System.out.println("Tax rate used by employee 2: " + taxRate + "%");
    }

    static class Employee {
        Employee() {
            System.out.println("Employee object created.");
        }
    }
}
