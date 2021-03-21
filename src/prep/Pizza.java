package prep;

public class Pizza extends Food {
    private boolean hasPineapples;
    private String crustType;


    public Pizza(String name, String description, int calories) throws Exception {
        super(name, description, calories);
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
}
