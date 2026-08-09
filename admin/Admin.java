package admin;

import hr.Employee;

public class Admin extends Employee {
    public void checkAccess() {
        System.out.println("Public field in another package: " + empId);
        System.out.println("Protected field in subclass in another package: " + dept);
        // System.out.println(password); // private field cannot be accessed here
    }
}
