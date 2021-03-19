package movies;
import com.sun.security.jgss.GSSUtil;
import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {
        // Movie.displayMovies(); // my solution

        // walkthrough solution
        boolean running = true;
        while (running) {
            System.out.println(returnMenuDisplay());

            int userResponse = promptUserForChoice();
            running = executeUserChoice(userResponse);
        }
    }


    // walk through solution
    private static boolean executeUserChoice(int choice) {
        boolean continueRunning = true;

        switch (choice){

            case 0:
                continueRunning = false;
                break;
            case 1:
                for(Movie movie : MoviesArray.findAll()) {
                    System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                }
                break;
            case 2:
                viewMoviesByCategory("animated");
                break;
            case 3:
                viewMoviesByCategory("drama");
                break;
            case 4:
                viewMoviesByCategory("horror");
                break;
            case 5:
                viewMoviesByCategory("scifi");
                break;
        }
        return continueRunning;
    }


    private static void viewMoviesByCategory(String category) {
        for(Movie movie : MoviesArray.findAll()) {
            if(movie.getCategory().equalsIgnoreCase(category)) {
                System.out.printf("%s -- %s\n ", movie.getName(), movie.getCategory());
            }
        }
    }


    private static String returnMenuDisplay() {
        String choices = "What would you like to do?\n"
                + "0 - exit\n"
                + "1 - view all movies\n"
                + "2 - view movies in the animated category\n"
                + "3 - view movies in the drama category\n"
                + "4 - view movies in the horror category\n"
                + "5 - view movies in the sci-fi category";
        return choices;
    }

    private static int promptUserForChoice() {
        Input userInput = new Input();
        System.out.println("Enter your choice: ");
        int response = userInput.getInt(0,5);

        return response;
    }
}
