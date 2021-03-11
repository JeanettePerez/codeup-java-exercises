package util;

import java.util.Scanner;

public class Input {

    private final Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public String getString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("would you like to continue? [Y]/[N]");
        String userInput = scanner.next();
        return (userInput.equalsIgnoreCase("Y") || userInput.equalsIgnoreCase("yes"));
    }
    public boolean yesNo(String prompt)  {
        System.out.println(prompt);
        String userInput = scanner.next();
        return (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes"));
    }

    public int getInt(int min, int max) {
        int userInput = getInt();
        if(userInput > max || userInput < min) {
            System.out.println("enter number from " + min + " and " + max);
            return getInt(min, max);
        }
        else
            System.out.println("done!");
            return userInput;
    }

    public int getInt() {
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }

    double getDouble(double min, double max) {
        System.out.print("Enter number from  " + min + " and " + max + ": ");
        double userInput = scanner.nextDouble();
        if(userInput < min || userInput > max){
            return getDouble(min, max);
        }
        else
            System.out.println("done!");
            return userInput;
    }

    double getDouble() {
        System.out.print("enter a number: ");
        return scanner.nextDouble();
    }


}
