public class Employee {

    String firstName;
    String lastName;
    public Employee(
            String firstName,
            String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String  printFullName(){

        return firstName + " " + lastName;
    }


}
