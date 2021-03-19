package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grade;
    private String username;

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grade = grades; // empty array list
    }

    public String getUsername(){
        return this.username;
    }

    public String getName(){
        return this.name;
    }

    public ArrayList<Integer> getGrade(){
        return this.grade;
    }

    public void addGrade(int grade) {
        this.grade.add(grade);
    }

    public double getGradeAverage(ArrayList<Integer> grades) {
        double total = 0;
        double lengthOfArray = grades.size();
        for(int grade : grades)
            total += grade;
        return total / lengthOfArray;
    }



}
