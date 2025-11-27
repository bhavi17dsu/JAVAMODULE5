import java.util.Scanner;
public class EmailValidator {
    static class InvalidEmailException extends Exception {
        public InvalidEmailException(String message) {
            super(message);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        try {
            validateEmail(email);
            System.out.println("Email is valid!");
        } catch (InvalidEmailException e) {
            System.out.println("Invalid Email: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
    static void validateEmail(String email) throws InvalidEmailException {
        if (email == null || email.isEmpty()) {
            throw new InvalidEmailException("Email cannot be empty.");
        }
        if (!email.contains("@")) {
            throw new InvalidEmailException("Email must contain '@' symbol.");
        }
        // Optional: additional checks (simple)
        if (email.startsWith("@") || email.endsWith("@")) {
            throw new InvalidEmailException("Invalid placement of '@'.");
        }
    }
}
