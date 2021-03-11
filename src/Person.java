public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, " + name);
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
