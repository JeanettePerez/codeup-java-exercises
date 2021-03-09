import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Say something to bob..");
        String userInput = sc.nextLine();

        String noResponse = "";
        String bobQuestionResponse = "sure";
        String bobExclamationResponse = "Whoa, Chill out!";

        boolean endsWithExclamationPoint = (userInput.endsWith("!"));
        boolean endsWithQuestionMark = (userInput.endsWith("?"));

        if (endsWithQuestionMark)
            System.out.println(bobQuestionResponse);
        else if (endsWithExclamationPoint)
            System.out.println(bobExclamationResponse);
        else if(userInput.equals(noResponse))
            System.out.println("Fine, be that way");
         else {
            System.out.println("whatever");
        }



        }


    }






