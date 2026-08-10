/*
12. A company wants employee salaries to only be increased (never decreased) through a public method, with the actual salary variable kept private. Write a Java program for a class Employee implementing this validation logic.
*/
class Q12 {
    static class Employee {
        private double salary;

        Employee(double salary) {
            this.salary = salary;
        }

        public void increaseSalary(double amount) {
            if (amount > 0) {
                salary += amount;
                System.out.println("Salary increased to: ₹" + salary);
            } else {
                System.out.println("Salary cannot be decreased.");
            }
        }

        public double getSalary() {
            return salary;
        }
    }

    public static void main(String[] args) {
        Employee e = new Employee(50000);
        e.increaseSalary(5000);
        e.increaseSalary(-2000);
        System.out.println("Current salary: ₹" + e.getSalary());
    }
}
