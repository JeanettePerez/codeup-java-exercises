package miniExercises;
import util.Input;

public class Ingredients {
    public boolean isHomemade;
    public String locationOfPurchase;

    public boolean isHomemade() {
        return isHomemade;
    }

    public void setHomemade(boolean homemade) {
        isHomemade = homemade;
    }

    public String getLocationOfPurchase() {
        return locationOfPurchase;
    }

    public void setLocationOfPurchase(String locationOfPurchase) {
        this.locationOfPurchase = locationOfPurchase;
    }

    public String getNameOfIngredient() {
        return nameOfIngredient;
    }

    public void setNameOfIngredient(String nameOfIngredient) {
        this.nameOfIngredient = nameOfIngredient;
    }

    public String nameOfIngredient;

   public void productionProcess(){
       if(locationOfPurchase.equalsIgnoreCase("store"))
           System.out.println(nameOfIngredient + " was made in a factory");
       else if (locationOfPurchase.equalsIgnoreCase("bakery"))
           System.out.println(nameOfIngredient + " was made in the kitchen every other morning");
       else
           System.out.println("undetermined production process");
   }




}
