package Oop;

public class Dish {

    private String nameOfDish;
    private boolean wouldRecommend;
    private float costInCents;


    public void printSummary(Dish dish) {
        System.out.printf(
                "Cost: %s\nName: %s\nRecommend: %b\n",
                DishTools.centToDollars(dish),
                getNameOfDish(),
                isWouldRecommend());

    }


    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public boolean isWouldRecommend() {
        return wouldRecommend;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

    public float getCostInCents() {
        return costInCents;
    }

    public void setCostInCents(float costInCents) {
        this.costInCents = costInCents;
    }
}
