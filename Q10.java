/*
10. An employee management system across two packages, hr and admin, needs to demonstrate that a public field is accessible everywhere, a protected field is accessible in a subclass in another package, and a private field is accessible only within its own class. Write a Java program demonstrating all three cases.
*/
import admin.Admin;
import hr.Employee;
class Q10 {
    public static void main(String[] args) {
        Employee e = new Employee();
        Admin a = new Admin();

        System.out.println("Public field from hr package: " + e.empId);
        a.checkAccess();

    
    }
}
