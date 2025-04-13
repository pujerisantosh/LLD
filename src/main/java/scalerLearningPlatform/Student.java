package scalerLearningPlatform;

public class Student extends User{
    private int studentId;
    private String course;
    // Constructor
    public Student(String username, String email, int studentId, String course) {
        super(username, email); // Call to User constructor
        this.studentId = studentId;
        this.course = course;
    }

    // Getter methods
    public int getStudentId() {
        return studentId;
    }

    public String getCourse() {
        return course;
    }

    // Override displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo(); // Reuse parent's display
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }
}
