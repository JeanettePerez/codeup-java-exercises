package miniExercises;
import util.Input;

public class Ingredients {
    public String nameOfIngredient;
    private boolean isHomemade;
    private String locationOfPurchase;
    protected int calories;



    public void throwAway() {
        System.out.println("Throwing away");
    }

    public boolean isHomemade() {
        return isHomemade;
    }

    public void setHomemade(boolean homemade) {
        isHomemade = homemade;
    }


    public void setLocationOfPurchase(String locationOfPurchase) {
        this.locationOfPurchase = locationOfPurchase;
    }


    public void setNameOfIngredient(String nameOfIngredient) {
        this.nameOfIngredient = nameOfIngredient;
    }


   public void productionProcess(){
        // adding more logic for input later
       if(locationOfPurchase.equalsIgnoreCase("store"))
           System.out.println(nameOfIngredient + " was made in a factory");
       else if (locationOfPurchase.equalsIgnoreCase("bakery"))
           System.out.println(nameOfIngredient + " was made in the kitchen every other morning");
       else
           System.out.println("undetermined production process");
   }






}
