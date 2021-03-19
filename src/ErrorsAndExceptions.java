public class ErrorsAndExceptions {

    public static void main(String[] args) {
        // ========= Throwing Exceptions
//        int[] numbers = {1, 2, 3};
//        System.out.println(numbers[999]); // exception of ArrayIndexOutOfBoundsException because the length is 3

//        throw new Exception("Something bad happened!"); //
//        System.out.println("after the throw statement"); // unreachable statement because the Exception above must be handled first
        // ========== Catching Exceptions
        // - handling exceptions by catching them (try-catch) block
        //      - try: the code is going to be tried. this code will potentially cause an exception
        //      - catch: code that handles exception if produced
        // define the type of exception in the catch with a parameter (e is commonly used)
//        try {
//            System.out.println("Let's see...");
//            int result = 1 / 0; // if this fails next line is skipped and the error message in the catch will display
//            System.out.println("I can divide by zero!");
//        } catch (ArithmeticException e) { // specifies what we are looking for
//            System.out.println("Math still works!");
//        }
//        int[] numbers = {1, 2, 3};
//        int x;
//
//        try {
//            x = numbers[100];
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Caught an array index exception!"); // the most specific will display
//        } catch (Exception e) {
//            System.out.println("Caught a generic exception!");
//        } finally { // will always run regardless of if an exception is thrown or not
//            System.out.println("This will always run.");
//        }
// === Try-Catch Scope
        // - it is a code block like a body of an if statement
        //

    }


}
