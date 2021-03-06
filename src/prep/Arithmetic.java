package prep;

public class Arithmetic {

    public static int square(int side) {
        return side * side;
    }

    public static int sum(int number1, int number2) {
        return number1 + number2;
    }

    public static int difference(int number1, int number2) {
        return number1 - number2;
    }

    public static int product(int number1, int number2) {
        return number1 * number2;
    }

    public static int sum1(int[] numbers){
        int sum = 0;
        for(int number : numbers)
            sum += sum + number;

        return sum;
    }
    public static double average1(int[] numbers) {
        int sum = sum1(numbers);
        return sum;
    }




    public static double average(double[] numArray) {
        double sum = 0;
        for (double number : numArray)
            sum = (int) (sum + number);

        return sum / numArray.length;

    }

}
