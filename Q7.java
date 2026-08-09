/*
7. A payroll system needs a method to calculate bonus for an individual employee (instance-specific) and another method to calculate the company-wide tax slab (same for all employees). Write a Java program for a class Employee demonstrating instance and static methods for this.
*/
class Q7 {
    static class Employee {
        String name;
        double salary;

        Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        double calculateBonus() {
            return salary * 0.10;
        }

        static double calculateTaxSlab(double salary) {
            if (salary <= 50000) {
                return 0.05;
            } else if (salary <= 100000) {
                return 0.10;
            } else {
                return 0.20;
            }
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Asha", 60000);
        Employee e2 = new Employee("Ravi", 120000);

        System.out.println(e1.name + " bonus: ₹" + e1.calculateBonus());
        System.out.println(e2.name + " bonus: ₹" + e2.calculateBonus());

        System.out.println("Asha tax slab: " + Employee.calculateTaxSlab(e1.salary));
        System.out.println("Ravi tax slab: " + Employee.calculateTaxSlab(e2.salary));
    }
}
