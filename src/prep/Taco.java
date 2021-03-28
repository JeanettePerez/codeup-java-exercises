package prep;

public class Taco extends Food {
    private boolean isSpicy;
    private String typeOfMeat;

    public Taco(String name, String description, int calories) throws Exception {
        super(name, description, calories);
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    public void setSpicy(boolean spicy) {
        isSpicy = spicy;
    }

    public String getTypeOfMeat() {
        return typeOfMeat;
    }

    public void setTypeOfMeat(String typeOfMeat) {
        this.typeOfMeat = typeOfMeat;
    }

}
