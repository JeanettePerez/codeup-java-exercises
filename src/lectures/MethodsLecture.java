import java.util.Scanner;

public class MethodsLecture {

    public static void main(String[] args) {
        int cal = multiplicationInputs(1,1);
        System.out.println("The answer is: " + cal);
        String name1 = "jeanette";
        String name2 = "Lane";
        String name3 = "Grim";
        printName(name1);
        printName(name1, name2);
        printName(name1, name2, name3);
    }

    /* TODO:
    *   -Write a public static method which returns an integer
    *   -The method should take in *two parameters* and *return* the product of multiplying them
    *   -Print the output to the console by calling the method, passing in params, and logging its output
    *   BONUS: Use the Scanner class to get the numbers from the user input
    * */
    public static int multiplicationInputs(int number1, int number2){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number you want to multiple: ");
        number1 = sc.nextInt();
        System.out.print("Enter the second number you want to multiple: ");
        number2 = sc.nextInt();

        sc.nextLine();
        return multiplicationCalculation(number1,number2);
    }

    public static int multiplicationCalculation(int number1, int number2){
        return number1 * number2;
    }
    /* TODO: Write a set of overloaded public static void methods which can take in 1-3 names and print
        * them to the console
     *   -Call each of the methods, passing in the names for each
     *   -Minus 1000pts if you don't use an oxford comma on the 3 param version
     *   BONUS: Use the Scanner class to get the names from user input
     *  */
    public static void printName(String name){
        System.out.printf("hello, %s \n", name);
    }

    public static void printName(String name1, String name2){
        System.out.printf("Hello, %s and %s\n", name1, name2);
    }

    public static void printName(String name1, String name2, String name3){
        System.out.printf("Hello, %s, %s, and %s\n ", name1, name2, name3);
    }





}