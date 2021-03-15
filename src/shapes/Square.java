package shapes;

public class Square extends Rectangle{

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getArea() {
        System.out.println("getting area from the Square class");
        return Math.pow(length, 2);
    }

    @Override
    public double getPerimeter() {
        System.out.println("getting perimeter from Square class");
        return 4 * length;
    }
}
