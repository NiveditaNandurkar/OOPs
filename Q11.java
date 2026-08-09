/*
11. A login system stores a user's password as a private variable and provides a public method checkPassword() that returns true/false without ever exposing the actual password value. Write a Java program to implement this using encapsulation.
*/
class Q11 {
    static class User {
        private String password = "abc@123";

        public boolean checkPassword(String enteredPassword) {
            return enteredPassword.equals(password);
        }
    }

    public static void main(String[] args) {
        User user = new User();

        System.out.println(user.checkPassword("abc@123"));
        System.out.println(user.checkPassword("wrongpass"));
    }
}
