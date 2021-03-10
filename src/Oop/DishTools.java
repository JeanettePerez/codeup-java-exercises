package Oop;


import java.text.NumberFormat;

public class DishTools {

    private static final int AVERAGE_COST_OF_DISH_IN_CENTS = 1_300;


    public static void shoutDishName(Dish dish) {
        System.out.println("name: " + dish.getNameOfDish().toUpperCase());
    }

    public static void analyzeDishCost(Dish dish) {
        if(dish.getCostInCents() > AVERAGE_COST_OF_DISH_IN_CENTS) {
            System.out.println(dish.getNameOfDish() + ": is higher than the average");
        }
        else if(dish.getCostInCents() < AVERAGE_COST_OF_DISH_IN_CENTS) {
            System.out.println(dish.getNameOfDish() + ": is less than the average");
        }
        else
            System.out.println("the cost of " + dish.getNameOfDish() + " is the average for a meal in the US");
    }

    public static void flipRecommendation(Dish dish) {
        System.out.println("Recommend: " + !dish.isWouldRecommend());
    }


    public static String centToDollars(Dish dish) {

        return NumberFormat
                .getCurrencyInstance()
                .format(dish.getCostInCents() / 100.);
    }
}
