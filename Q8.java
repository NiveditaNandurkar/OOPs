/*
8. A form validation system in an application accepts age as text input (String) from a user and needs to convert it to an integer for eligibility checking (e.g., age ≥ 18). Write a Java program using wrapper classes to perform this conversion and check.
*/
class Q8 {
    public static void main(String[] args) {
        String ageText = "19";

        Integer age = Integer.valueOf(ageText);

        if (age >= 18) {
            System.out.println("Eligible for voting.");
        } else {
            System.out.println("Not eligible for voting.");
        }
    }
}
