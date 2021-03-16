package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Quadrilateral myShape1 = new Rectangle(5,4);
        System.out.println("Area of a Rectangle: " + myShape1.getArea());
        System.out.println("perimeter of rectangle: " + myShape1.getPerimeter());
        System.out.println();

        Quadrilateral myShape2 = new Square(5);
        System.out.println("area of square: " + myShape2.getArea());
        System.out.println("perimeter of square: " + myShape2.getPerimeter());


    }



// ========= inheritance Exercise
//    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5,4);
//        System.out.println("Area of rectangle: " + box1.getArea()); // 20
//        System.out.println("perimeter of rectangle: " + box1.getPerimeter()); // 18
//
//        Rectangle box2 = new Square(5);
//        System.out.println("area of square: " + box2.getArea()); // 25
//        System.out.println("perimeter of square: " + box2.getPerimeter()); // 20
//    }
}
