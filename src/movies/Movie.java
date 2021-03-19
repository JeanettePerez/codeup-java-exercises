package movies;

import util.Input;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


//    private static void categoriesMenu() {
//
//        System.out.println("What would you like to do?");
//        System.out.println();
//        System.out.println("0 - exit");
//        System.out.println("1 - view all movies");
//        System.out.println("2 - view movies in the animated category");
//        System.out.println("3 - view movies in the drama category");
//        System.out.println("4 - view movies in the horror category");
//        System.out.println("5 - view movies in the sci-fi category");
//        System.out.println();
//        System.out.print("Enter your choice: ");
//
//    }
//
//
//    public static void displayMovies() {
//        categoriesMenu();
//        int userInput = new Input().getInt(0,5);
//        Movie[] movieList = MoviesArray.findAll();
//
//
//            if (userInput == 1) {
//                for (Movie movie : movieList) {
//                    System.out.println(movie.getName() + " - " + movie.getCategory());
//                }
//            } else if (userInput == 2) {
//                for (Movie movie : movieList) {
//                    if (movie.getCategory().equalsIgnoreCase("animated")) {
//                        System.out.println(movie.getName() + " - " + movie.getCategory());
//                    }
//                }
//            } else if (userInput == 3) {
//                for (Movie movie : movieList) {
//                    if (movie.getCategory().equalsIgnoreCase("drama")) {
//                        System.out.println(movie.getName() + " - " + movie.getCategory());
//                    }
//                }
//            } else if (userInput == 4) {
//                for (Movie movie : movieList) {
//                    if (movie.getCategory().equalsIgnoreCase("horror")) {
//                        System.out.println(movie.getName() + " - " + movie.getCategory());
//                    }
//                }
//            } else if (userInput == 5) {
//                for (Movie movie : movieList) {
//                    if (movie.getCategory().equalsIgnoreCase("scifi")) {
//                        System.out.println(movie.getName() + " - " + movie.getCategory());
//                    }
//                }
//            }
//         else
//             System.exit(0);
//
//    }



}
