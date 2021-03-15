package miniExercises;

public class Knife extends KitchenTool{

    @Override
    public void putAway() {
        System.out.println("putting away knife");
    }

    public Knife(boolean isWashable) {
        super(isWashable);
    }
}
