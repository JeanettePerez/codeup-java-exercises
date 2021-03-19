package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, String> usernames = new HashMap<>();

        ArrayList<Integer> myGrades = new ArrayList<>();
        Student Jeanette = new Student("Jeanette", myGrades);
        Jeanette.addGrade(90);
        Jeanette.addGrade(96);
        Jeanette.addGrade(87);
        usernames.put("Jeanette ", " jmp134");
        System.out.println(usernames);

        ArrayList<Integer> grades = new ArrayList<>();
        Student Lane = new Student("Lane", grades);
        Jeanette.addGrade(99);
        Jeanette.addGrade(95);
        Jeanette.addGrade(90);
        usernames.put("Lane ", " DLE345");
        System.out.println(usernames);

        ArrayList<Integer> meganGrades = new ArrayList<>();
        Student Megan = new Student("Megan", meganGrades);
        Jeanette.addGrade(99);
        Jeanette.addGrade(95);
        Jeanette.addGrade(90);
        usernames.put("Megan ", " MSS890");
        System.out.println(usernames);

        ArrayList<Integer> spenserGrades = new ArrayList<>();
        Student Spenser = new Student("Spenser", spenserGrades);
        Jeanette.addGrade(99);
        Jeanette.addGrade(95);
        Jeanette.addGrade(90);
        usernames.put("Spenser ", " SEA612");
        System.out.println(usernames);

    }
}
