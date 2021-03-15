package miniExercises;

public class IngredientTest {



    public static void main(String[] args) {
        Ingredients jelly = new Jelly();
        throwAwayIngredient(jelly);
        Ingredients peanutButter = new PeanutButter();
        throwAwayIngredient(peanutButter);
        Ingredients bread = new Bread();
        throwAwayIngredient(bread);
    }



    public static void throwAwayIngredient(Ingredients ingredients){
        ingredients.throwAway();
    }

}
