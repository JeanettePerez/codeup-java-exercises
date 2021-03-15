package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5,4);
        System.out.println("Area of rectangle: " + box1.getArea()); // 20
        System.out.println("perimeter of rectangle: " + box1.getPerimeter()); // 18

        Rectangle box2 = new Square(5);
        System.out.println("area of square: " + box2.getArea()); // 25
        System.out.println("perimeter of square: " + box2.getPerimeter()); // 20
    }
}
