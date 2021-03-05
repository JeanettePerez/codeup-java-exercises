import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("hi, im bob. ask me anything");
        String userInputQuestion = sc.nextLine();
        String noResponse = "";
        String bobQuestionResponse = "sure";
        String bobExclamationResponse = "Whoa, Chill out!";

        boolean endsWithExclamationPoint = (userInputQuestion.endsWith("!"));
        boolean endsWithQuestionMark = (userInputQuestion.endsWith("?"));

        if (endsWithQuestionMark)
            System.out.println(bobQuestionResponse);
        else if (endsWithExclamationPoint)
            System.out.println(bobExclamationResponse);
        else if(userInputQuestion.equals(noResponse))
            System.out.println("Fine, be that way");
         else {
            System.out.println("whatever");
        }



        }


    }






