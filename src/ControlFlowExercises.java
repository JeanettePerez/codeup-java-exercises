import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ControlFlowExercises {

    public static void main(String[] args) {
// create while loop when i = 5 and runs as long as i is less than or equal to 15
// increment by one.
//        int i = 5;
//        while(i <= 15){
//        System.out.println(i);
//            i++;
//        }

// create do while loop that will cut by 2's starting at 0 and ending at 100

//        int count = 0;
//        do {
//            System.out.println(count);
//            count += 2;
//        } while (count <= 100);

// Alter loop to count backwards by 5's from 100 to -10

//        int count = 100;
//        do {
//            System.out.println(count);
//            count -= 5;
//        } while (count >= -10);
// refactor the above to a for loop
//        for(int i = 100; i >= -10; i -= 5){
//            System.out.println(i);
//        }
// create a do while loop that starts at 2, and displays the number
// squared on each line while the number is less than 1,000,000.

//    long number = 2;
//    do {
//        System.out.println(number);
//        number *= number;
//    } while (number < 1000000);

// refactor the above to a for loop

//     for(long i = 2; i < 1000000; i *= i){
//         System.out.println(i);
//     }
// FizzBuzz program
//    for(int num = 1; num < 100; num++) {
//        if ((num % 3 == 0) && (num % 5 == 0)) {
//            System.out.println("FizzBuzz");
//        }
//        else if (num % 3 == 0) {
//            System.out.println("Fizz");
//        }
//        else if (num % 5 == 0) {
//            System.out.println("buzz");
//        } else {
//            System.out.println(num);
//        }
//    }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("What number would you like to go up to? ");
//        int inputStart = sc.nextInt();
//        System.out.println("number" + "|" + "squared" + "|" + "cubed");
//        System.out.println("------" + "|" + "-------" + "|" + "-----");
//        for(int row = 1; row <= inputStart; row++){
//            int numberSquared = (int) Math.pow(row, 2);
//            int numberCubed = (int) Math.pow(row, 3);
//            System.out.println(row + "\t  " + "|" + numberSquared + "\t  " + "|" + numberCubed);
//        }
//        char choice = 'y';
//        do{
//        System.out.println("Continue? (Y/N)");
//        choice = sc.next().charAt(0);
//        }
//        while (choice == 'n' || choice == 'N');

// grade Converter
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your numerical grade: ");
        double numGrade = sc.nextDouble();
        char letterGrade = 'F';

        if (numGrade >= 90)
            letterGrade = 'A';
        else if(numGrade >= 80)
            letterGrade = 'B';
        else if(numGrade >= 70)
            letterGrade = 'C';
        else if(numGrade >= 60)
            letterGrade = 'D';

        String message = ("Your letter Grade is a " + letterGrade);
        while(true) {
            if(numGrade >= 99) {
                System.out.println(message + "+");
                break;
            }
            else
                System.out.println(message);
                break;
        }
















    }

   }




