import java.util.HashMap;

public class Employees {
    private String name;
    private int employeeId;

    // Static fields to track the total number of employees and the next available employee ID
    private static int totalEmployees = 0;
    private static int nextEmployeeId = 1;

    public Employees(String name) {
        this.name = name;
        // Assign a unique employee ID based on the next available ID
        this.employeeId = nextEmployeeId;
        // Increment the total number of employees and the next available employee ID
        totalEmployees++;
        nextEmployeeId++;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }
}
