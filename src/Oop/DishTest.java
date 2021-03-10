package Oop;


public class DishTest {

    public static void main(String[] args) {
        var dish1 = new Dish();
        dish1.setNameOfDish("sloppy Joe's");
        dish1.setCostInCents(1300);
        dish1.setWouldRecommend(true);


        dish1.printSummary(dish1);
        DishTools.shoutDishName(dish1);
        DishTools.analyzeDishCost(dish1);
        DishTools.flipRecommendation(dish1);



    }

}
