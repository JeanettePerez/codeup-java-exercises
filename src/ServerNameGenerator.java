import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {
        System.out.println(nameGenerator());

        // Walk through example
        String[] adjectives = { "artistic", "charming", "graceful", "rough", "thankful", "helpful", "bitter", "petty", "fancy", "responsive" };
        String[] nouns = { "spoon", "dog", "earth", "toaster", "texas", "school", "ocean", "woman", "coffee", "fruit" };
        System.out.println(getWord(adjectives) + "-" + getWord(nouns));
    }

    public static String nameGenerator(){
        String[] adjectives = { "artistic", "charming", "graceful", "rough", "thankful", "helpful", "bitter", "petty", "fancy", "responsive" };
        String[] nouns = { "spoon", "dog", "earth", "toaster", "texas", "school", "ocean", "woman", "coffee", "fruit" };
        Random random = new Random();
        int randomAdj = random.nextInt(adjectives.length);
        int randomNoun = random.nextInt(nouns.length);

        String message = "Here is your server name: ";
        String randomName = adjectives[randomAdj] + "-" + nouns[randomNoun];
        return message + randomName;
    }

    // walk through example
    public static String getWord(String[] choices) {
        Random random = new Random();
        int randomWord = random.nextInt(choices.length);
        return choices[randomWord];
    }

}
