package task;
import java.util.ArrayList;
import java.util.List;

// Custom checked exception for email not found
class EmailNotFoundException extends Exception {
    public EmailNotFoundException(String message) {
        super(message);
    }
}

// Custom unchecked exception for invalid domain
class InvalidDomainException extends RuntimeException {
    public InvalidDomainException(String message) {
        super(message);
    }
}

public class EmailValidator {

    private static List<String> emailList = new ArrayList<>();

    static {
        // Add some sample email addresses to the list
        emailList.add("example1@example.com");
        emailList.add("example2@example.com");
        emailList.add("example3@example.com");
    }

    public static void main(String[] args) {
        String email = "example4@example.com"; // Change this to test different scenarios

        try {
            validateEmail(email);
            System.out.println("Email is valid.");
        } catch (EmailNotFoundException e) {
            System.out.println("Email not found: " + e.getMessage());
        } catch (InvalidDomainException e) {
            System.out.println("Invalid domain: " + e.getMessage());
        }
    }

    public static void validateEmail(String email) throws EmailNotFoundException, InvalidDomainException {
        if (!emailList.contains(email)) {
            throw new EmailNotFoundException("Email not found in the list.");
        }
        
        if (!email.contains("@")) {
            throw new InvalidDomainException("Invalid domain format. '@' symbol missing.");
        }
    }
}
