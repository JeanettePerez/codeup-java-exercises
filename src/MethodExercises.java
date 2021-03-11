import java.util.Scanner;

public class MethodExercises {

    public static void main(String[] args) {
//        System.out.println(addition(2,3));
//        System.out.println(subtraction(5,4));
//        //System.out.println(multiplication(2,2));
//        System.out.println(division(10,2));
//        System.out.println(modulus(10,2));
//        int userInput = getInteger(1,10);
//        System.out.println(userInput);
        // getFactorial("");
        // System.out.println(multiplicationRecursion(8,8));
        diceGame();

    }

//    public static int addition(int input1, int input2) {
//        return input1 + input2;
//    }
//
//    public static int subtraction(int input1, int input2) {
//        return input1 - input2;
//    }
//
//    public static int multiplication(int input1, int input2) {
//        return input1 * input2;
//
//    }
//
//    public static int multiplicationLoop(int input1, int input2) {
//        int multiplied = 0;
//        do{
//            multiplied += input1;
//            input2--;
//        } while (input2 != 0);
//        return multiplied;
//
//    }
//
//    public static int multiplicationRecursion(int input1, int input2) {
//        int multiplied = 0;
//        if(input2 != 0)
//            multiplied = input1 + multiplicationRecursion(input1, input2 -1);
//        return multiplied;
//    }
//
//
//    public static int division(int input1, int input2) {
//        return input1 / input2;
//    }
//
//    public static int modulus(int input1, int input2) {
//        return input1 % input2;
//    }

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int value;

        do {
            System.out.print("Enter a number between " + min + " and " + max);
            value = sc.nextInt();
        } while (value <= min && value >= max);
        return value;
    }
//
//    public static void userWantsToContinue() {
//        Scanner sc = new Scanner(System.in);
//
//        String input;
//        do {
//            System.out.print("Would you like to continue: [Y/N] ");
//            input = sc.next();
//        }
//        while (input.equalsIgnoreCase("N"));
//    }


//    public static void getFactorial(String input) {
//        sc = new Scanner(System.in);
//        System.out.println(input);
//        long factorial = 1;
//        int number = getInteger(1,20);
//        for (int i = 1; i <= number; i++)
//            factorial = factorial * i;
//        System.out.println("Factorial of " + number + " is: " + factorial);
//
//        userWantsToContinue("");
//    }

    public static void diceGame() {
        System.out.print("Enter the number of sides for a pair of dice: ");
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int min = 1;
        int range = max - min + 1;
        int randomNumber1 = 0;
        int randomNumber2 = 0;
        for(int i = 0; i <= max; i++){
            randomNumber1 = (int) (Math.random() * range) + min;
            randomNumber2 = (int) (Math.random() * range) + min;
        }
        System.out.println("Dice 1: " + randomNumber1);
        System.out.println("Dice 2: " + randomNumber2);

    }




}