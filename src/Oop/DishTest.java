package Oop;


public class DishTest {

    public static void main(String[] args) {
        Dish dish1 = new Dish();
        dish1.nameOfDish = "sloppy Joe's";
        dish1.costInCents = 1_500;
        dish1.wouldRecommend = true;

        dish1.printSummary();
        //dish1.centToDollars();

        DishTools.shoutDishName();
        DishTools.analyzeDishCost();
        DishTools.flipRecommendation();


    }

}
