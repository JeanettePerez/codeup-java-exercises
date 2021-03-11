package util;

import java.util.Scanner;

public class Input {

    private final Scanner SCANNER;

    public Input() {
        SCANNER = new Scanner(System.in);
    }

    public String getString() {

        return SCANNER.nextLine();
    }

    public String getString(String prompt) {
        System.out.print(prompt);
        return SCANNER.nextLine();
    }

    public boolean yesNo() {
        System.out.println("would you like to continue? [Y]/[N]");
        String userInput = SCANNER.next();
        return (userInput.equalsIgnoreCase("Y") || userInput.equalsIgnoreCase("yes"));
    }
    public boolean yesNo(String prompt)  {
        System.out.println(prompt);
        String userInput = SCANNER.next();
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
        return SCANNER.nextInt();
    }


    public double getDouble(double min, double max) {
        double userInput = getDouble();
        if(userInput >= min && userInput <= max){
            return userInput;
        }
        else
            System.out.print("out of range: Enter number from  " + min + " and " + max + ": ");
        return getDouble(min, max);
    }

//    double getDouble(double min, double max) {
//        System.out.print("Enter number from  " + min + " and " + max + ": ");
//        double userInput = scanner.nextDouble;
//        if(userInput < min || userInput > max){
//            return getDouble(min, max);
//        }
//        else
//            System.out.println("done!");
//            return userInput;
//    }

    public double getDouble() {
        if (SCANNER.hasNextInt())
            return SCANNER.nextDouble();
        else {
            System.out.println("invalid input; please enter an integer!");
            SCANNER.nextLine();
            return getDouble();
        }
    }


}
