public class HelloWorld {
    public static void main(String[] args) {

        int myFavoriteNumber = 24;
        System.out.println(myFavoriteNumber);

        String myString = "Geronimo";
        System.out.println(myString);

        float myNumber = 3.14F;
        System.out.println(myNumber);

       /* int x = 5;
       * System.out.println(x++);
       * System.out.println(x);
        */

        /* int x = 4;
        * x += 5;
        */

        /*
        * int x = 3;
        * int y = 4;
        * y *= x;
        System.out.println(y); */

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;

        System.out.println(x);
        System.out.println(y);
    }
}
