package scalerLearningPlatform;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("john_doe", "john@example.com", 101, "Data Structures");
        Employee employee = new Employee("jane_smith", "jane@example.com", 201, "Engineering");

        System.out.println("--- Student Info ---");
        student.displayInfo();

        System.out.println("\n--- Employee Info ---");
        employee.displayInfo();
    }
    }

