package Oop;

public class Dish {

    public static String nameOfDish;
    public static boolean wouldRecommend;
    public static float costInCents;


    public void printSummary() {
        System.out.printf("Cost: %s\nName: %s\nRecommend: %b\n", DishTools.centToDollars(), nameOfDish, wouldRecommend);

    }


}
