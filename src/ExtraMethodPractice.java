import java.util.Scanner;

    public class ExtraMethodPractice {

        private static Scanner sc;

        public static void main(String[] args) {
//            firstChar("");
//            secondChar("");
//            lastChar("");
//            secondToLastChar("");
            userWantsToContinue("");
        }

        public static void firstChar(String input) {
            sc = new Scanner(System.in);
            System.out.print("Enter a word so we can determine the first character ");
            input = sc.next();

            char firstCharacter = input.charAt(0);
            System.out.println("The first character of your word is: " + firstCharacter);
        }

        public static void secondChar(String input) {
           sc = new Scanner(System.in);
            System.out.print("Enter a word so we can determine the word character ");
            input = sc.next();

            char secondCharacter = input.charAt(1);
            System.out.println("The second character of your sentence is: " + secondCharacter);
        }


        public static void lastChar(String input) {
           sc = new Scanner(System.in);
            System.out.print("Enter a word so we can determine the last character ");
            input = sc.next();
            int inputLength = input.length();

            char lastCharacter = input.charAt(inputLength - 1);
            System.out.println("The last character of your word is: " + lastCharacter);
        }

        public static void secondToLastChar(String input) {
            sc = new Scanner(System.in);
            System.out.println("Enter a word so we can determine the last character ");
            input = sc.next();
            int inputLength = input.length();

            char secondToLastCharacter = input.charAt(inputLength - 2);
            System.out.println("The second to last charater of your word is: " + secondToLastCharacter);

        }
        public static void userWantsToContinue(String input) {
            sc = new Scanner(System.in);

            do{
                System.out.print("Would you like to continue: [Y/N] ");
                input = sc.next();
            }
            while (input.equalsIgnoreCase("N")) ;
        }

    }


