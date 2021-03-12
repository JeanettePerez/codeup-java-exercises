import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers)); // prints out the reference location

//        Person[] peopleArray = new Person[3];
//        peopleArray[0] = new Person("megan");
//        peopleArray[1] = new Person("lane");
//        peopleArray[2] = new Person("spenser");

        Person[] people = {
                new Person("lane"),
                new Person("megan"),
                new Person("spenser")};

        Person newMemberNumberFour = new Person("Teagan");
        people = (Person[]) addPerson(people, newMemberNumberFour);
        for (Person person : people)
            System.out.println(person.getName());


    }

    public static Object addPerson(Object[] person, Object obj) {
        Object[] addedToList = Arrays.copyOf(person, person.length + 1);
        Arrays.fill(addedToList, person.length, person.length +1, obj);
        return addedToList;
    }

}
