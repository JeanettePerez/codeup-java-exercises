package miniExercises;

public class Main {

    public static void main(String[] args) {
        Bread bread = new Bread();
        bread.nameOfIngredient = "honey wheat";
        bread.locationOfPurchase = "store";
        System.out.println(bread.nameOfIngredient);
        bread.productionProcess();
    }
}
