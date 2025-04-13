package scalerLearningPlatform;

public class Employee extends User{
    private int employeeId;
    private String department;

    // Constructor
    public Employee(String username, String email, int employeeId, String department) {
        super(username, email); // Call to User constructor
        this.employeeId = employeeId;
        this.department = department;
    }

    // Getter methods
    public int getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    // Override displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo(); // Reuse parent's display
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }
}
