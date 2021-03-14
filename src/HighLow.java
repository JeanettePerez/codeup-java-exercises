import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {

    }


    public static void randomNumber() {
        int max = 100;
        int min = 1;
        int range = max - min + 1;
        int randomNumber = 0;
        for (int i = 0; i <= max; i++) {
            randomNumber = (int) (Math.random() * range) + min;

        }
    }

        public static void playGame (Scanner sc) {

            System.out.println("Please guess a number between 1 and 100: ");
            int userGuess = sc.nextInt();

            if (userGuess < 1 || userGuess > 100) {
                System.out.println("Your guess is out of bounds. Please try again");
            }


        }

        public static String checkGuess(int guess, int targetNum){
            if (guess == targetNum)
                return "you guessed the correct number";
            else if (guess > targetNum)
                return "pick a lower number";
            else if (guess < targetNum)
                return "pick a higher number";
            return "error";
        }

    }

