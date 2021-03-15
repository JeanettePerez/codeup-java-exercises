package miniExercises;

public class Plate extends KitchenTool{

    @Override
    public void putAway() {
        System.out.println("Putting away plate");
    }

    public Plate(boolean isWashable) {
        super(isWashable);
    }
}
