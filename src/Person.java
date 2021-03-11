public class Person {

    private String name;

    public Person(String name) {
    // TODO: create a constructor that accepts a 'String' value and sets the person's name to the passed string
        this.name = name;
    }


    public String getName() {
    // TODO: return the person's name
        return name;
    }

    public void setName(String name) {
    // TODO: change the name property to the passed value
        this.name = name;
    }

    public void sayHello() {
    // TODO: print a message to the console using the person's name
        System.out.println(this.name + " say's hi");
    }

    public static void main(String[] args) {
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(
//                person1.getName().equals
//                        (person2.getName())); // true, equals checks the value to the string variable
//        System.out.println(person1 == person2); // false, it is checking reference to the string object in memory

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); // both point to the same memory location

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName()); // returns the name you have it
//        System.out.println(person2.getName()); // is referencing the same memory location
//        person2.setName("Jane");
//        System.out.println(person1.getName()); // changes the name to jane
//        System.out.println(person2.getName()); // referencing person1 location

    }

}
