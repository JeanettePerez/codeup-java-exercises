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

//    public boolean yesNo() {
//
//
//    }

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
        double userInput = getDouble();
        if(userInput < min || userInput > max){
            System.out.println("Enter number from " + min + " and " + max);
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
