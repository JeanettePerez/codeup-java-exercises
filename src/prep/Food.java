package prep;

import java.util.ArrayList;
import java.util.List;

public class Food implements Consumable {
    private String name;
    private String description;
    private int calories;


    public Food(String name, String description, int calories) throws Exception {
        this.name = name;
        this.description = description;
        this.calories = calories;
        if(name == null || name.equals(""))
             throw new IllegalArgumentException(String.format("The argument %s cannot be null or empty", name));
        if(description== null || description.equals(""))
            throw new IllegalArgumentException(String.format("The argument %s cannot be null or empty", description));
        if(calories <= 0)
            throw new IllegalArgumentException(String.format("The argument %s cannot be null or empty", calories));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }


    @Override
    public void consume() {
        System.out.printf("i love %s ", name);
    }

    @Override
    public ArrayList<String> getFullDescription() {
        return null;
    }
}
