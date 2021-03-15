package lectures;

public class Employee extends Person{

    public int employeeNumber;

    public void stateEmployeeNumber() {
        System.out.println(getName() + " says: My Employee number is " + employeeNumber);
    }

}
