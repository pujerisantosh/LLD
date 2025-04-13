package scalerLearningPlatform;

public class User {

    private String username;
    private String email;

    // Constructor
    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    // Getter methods
    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    // Display user info
    public void displayInfo() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
    }
}
