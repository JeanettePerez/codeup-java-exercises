package miniExercises;

public class Main {

    public static void main(String[] args) {
        Bread bread = new Bread();
        bread.setNameOfIngredient("bread");
        bread.setLocationOfPurchase("store");
        bread.productionProcess();

        var knife = new Knife(true);
        knife.putAway();



    }
}
