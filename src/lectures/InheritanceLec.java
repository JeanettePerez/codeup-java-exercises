package lectures;

public class InheritanceLec {

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Jeanette");
        System.out.println(p.name);

        Employee e = new Employee();
        e.name = "Grim";
        e.employeeNumber = 1001;
        e.stateEmployeeNumber();
        System.out.println(e.getName());

    }


}
