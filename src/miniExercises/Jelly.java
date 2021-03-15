package miniExercises;

public class Jelly extends Ingredients {
    @Override
    public void throwAway() {
        System.out.println("Trowing away Jelly");
    }

    public void calories(){
        System.out.println(calories);
        // protected is only public to the child in the package it is in and private to different packages
        // private is hidden from everywhere except the class it is in.
        // public any class can use it
    }


}
