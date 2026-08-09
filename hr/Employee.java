package hr;

public class Employee {
    public int empId = 101;
    protected String dept = "HR";
    private String password = "secret123";

    public void showAccess() {
        System.out.println("Public field: " + empId);
        System.out.println("Protected field: " + dept);
        System.out.println("Private field is accessible only inside this class.");
    }
}
