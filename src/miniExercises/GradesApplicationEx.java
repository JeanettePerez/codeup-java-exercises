package miniExercises;

import util.Input;

import java.util.HashMap;
import java.util.Map;
// TODO: I can't seem to start the application. Help!
// TODO: Even when it was running, it never let me enter in more than one student before exiting.
// TODO: The grade average is WAY too precise. It only needs to display to two decimal places.
// TODO: Why do I keep seeing information for Fred when I search for Cathy's info?


public class GradesApplicationEx {
    private final Map<String, StudentDebuggingEx> students;
    private final InputDebuggingEx input;

    public GradesApplicationEx(Map<String, StudentDebuggingEx> students, InputDebuggingEx input) {
        this.students = students;
        this.input = input;
    }


    // Starts App
    public void init() {
        System.out.println("Welcome!");
        runInteraction();
    }

    // Abstracts the Part that Repeats
    private void runInteraction() {
        System.out.println(getStudentsList());
        System.out.println("\nWhat student would you like to see more information on?");
        String response = input.getString();
        if (students.containsKey(response)) {
            System.out.println(getStudentInfo(response));
            System.out.println("\nWould you like to enter a new response?");
        }
        else {
            System.out.println("\nSorry, no student found with the GitHub username of " + response);
            System.out.println("\nWould you like to enter a new response?");
        }
        boolean willContinue = input.yesNo();
        if(willContinue)
            runInteraction();
        else
            System.out.println("\nGoodbye!");

    }

    // Returns a message containing a list of students
    private String getStudentsList() {
        String output = "Here are the user names of our students:\n\n";
        for (Map.Entry<String, StudentDebuggingEx> entry : students.entrySet()) {
            output += "|" + entry.getKey() + "| ";
        }
        return "\n" + output.trim();
    }

    // Returns a formatted message containing student information
    private String getStudentInfo(String username) {
        return String.format(
                "%nName: %s - GitHub Username: %s%nCurrent Average: %.2f",
                students.get(username).getName(),
                username,
                students.get(username).getGradeAverage());
    }

    // Used to populate the HashMap of students
    private static HashMap<String, StudentDebuggingEx> createStudents() {

        HashMap<String, StudentDebuggingEx> students = new HashMap<>();

        StudentDebuggingEx s1 = new StudentDebuggingEx("Fred");
        s1.addGrade(0);
        s1.addGrade(50);
        s1.addGrade(100);

        StudentDebuggingEx s2 = new StudentDebuggingEx("Cathy");
        s2.addGrade(50);
        s2.addGrade(50);
        s2.addGrade(75);

        StudentDebuggingEx s3 = new StudentDebuggingEx("Bob");
        s3.addGrade(80);
        s3.addGrade(20);
        s3.addGrade(100);

        students.put("fred123", s1);
        students.put("cathy123", s2);
        students.put("bob123", s3);

        return students;

    }

    public static void main(String[] args) {
        var grades = new GradesApplicationEx(createStudents(), new InputDebuggingEx());
        grades.init();
    }


}
