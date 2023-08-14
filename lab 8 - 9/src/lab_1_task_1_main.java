public class lab_1_task_1_main {
    public static void main(String[] args) {
        Employees emp1 = new Employees("John");
        Employees emp2 = new Employees("Alice");
        Employees emp3 = new Employees("Bob");

        // Access the total number of employees using the static method
        int totalEmployees = Employees.getTotalEmployees();
        System.out.println("Total Employees: " + totalEmployees);

        // Print details of each employee
        System.out.println("Employee ID: " + emp1.getEmployeeId() + ", Name: " + emp1.getName());
        System.out.println("Employee ID: " + emp2.getEmployeeId() + ", Name: " + emp2.getName());
        System.out.println("Employee ID: " + emp3.getEmployeeId() + ", Name: " + emp3.getName());
    }
}
