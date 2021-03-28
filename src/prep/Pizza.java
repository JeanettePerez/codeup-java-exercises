package prep;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends Food {
    private boolean hasPineapples;
    private String crustType;


    public Pizza(String name, String description, int calories, boolean hasPineapples) throws Exception {
        super(name, description, calories);
        this.hasPineapples = hasPineapples;
    }

    public boolean isHasPineapples() {
        return hasPineapples;
    }

    public void setHasPineapples(boolean hasPineapples) {
        this.hasPineapples = hasPineapples;
    }

    public String getCrustType() {
        return crustType;
    }

    public void setCrustType(String crustType) {
        this.crustType = crustType;
    }

    @Override
    public ArrayList<String> getFullDescription() {
       String name = super.getName();
       String description = super.getDescription();
       String calories = super.getCalories() + "";
       String hasPineapples = isHasPineapples()
               ? "pinapples"
               : "no pinapples";
        List<String> list = new ArrayList<>();
        list.add(name);
        list.add(description);
        list.add(calories);
        list.add(hasPineapples);
        return list;
        }
    }

