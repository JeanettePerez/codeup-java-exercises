package prep;

public class App {

    public static void main(String[] args) {
        int square = Arithmetic.square(10);
        System.out.println(square);

        int sum = Arithmetic.sum(2,5);
        System.out.println(sum);

        int difference = Arithmetic.difference(10,5);
        System.out.println(difference);

        int product = Arithmetic.product(2,2);
        System.out.println(product);

        double average = Arithmetic.average(new double[]{1, 2, 3, 4});
        System.out.println(average);
    }

}
