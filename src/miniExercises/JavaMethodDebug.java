package miniExercises;
// warm up 3/15

public class JavaMethodDebug {
    // TODO: Fix the method below to work as expected.
    //  The method should take in a string and character and return the number of instances of the passed character in the string.
    public static int countLetters(String input, char character) {
        int charCount = 0;

        for (int i = 0; i < input.length(); i++) {
            if (Character.toLowerCase(input.charAt(i)) == character)  {
                charCount++;
            }
        }
        return charCount;
    }



    public static void main(String[] args) {
        int numberOfSs = countLetters("MissiSSippi", 's');
        System.out.println(numberOfSs); // should return 4
    }
}
