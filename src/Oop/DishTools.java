package Oop;


import java.text.NumberFormat;

public class DishTools {

    public static final int AVERAGE_COST_OF_DISH_IN_CENTS = 1_300;

    public static void shoutDishName() {
        System.out.println(Dish.nameOfDish.toUpperCase());
    }

    public static void analyzeDishCost() {

        if(Dish.costInCents > AVERAGE_COST_OF_DISH_IN_CENTS)
            System.out.println("More expensive than average");
        else if(Dish.costInCents < AVERAGE_COST_OF_DISH_IN_CENTS)
            System.out.println("less expensive than average");
        else
            System.out.println(centToDollars()
                    + " is the average cost of of a meal in the US");
    }

    public static void flipRecommendation() {
        System.out.println(!Dish.wouldRecommend);
    }


    public static String centToDollars() {
        return NumberFormat.getCurrencyInstance().format(Dish.costInCents / 100.);
    }
}
