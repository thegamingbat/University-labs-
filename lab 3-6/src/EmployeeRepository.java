import java.util.HashSet;

public class EmployeeRepository {
     HashSet<Employee> employeesSet = new HashSet<Employee>();
    public  void addEmployee(Employee obj){
        employeesSet.add(obj);
    }
    public  void removeEmployee(Employee obj){
        if(employeesSet.contains(obj)){
            employeesSet.remove(obj);

        }else System.out.println("employee does not exists");


    }
    public  void displayEmployees(){
        for (Employee E:employeesSet) {
            System.out.println(E.printFullName());

        }
    }

}
