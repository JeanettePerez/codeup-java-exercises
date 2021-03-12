import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {
        System.out.println(nameGenerator());
    }

    public static String nameGenerator(){
        String[] adjectives = { "artistic", "charming", "graceful", "rough", "thankful", "helpful", "bitter", "petty", "fancy", "responsive" };
        String[] nouns = { "spoon", "dog", "earth", "toaster", "texas", "school", "ocean", "woman", "coffee", "fruit"};
        Random random = new Random();
        int randomAdj = random.nextInt(adjectives.length);
        int randomNoun = random.nextInt(nouns.length);

        String message = "Here is your server name: ";
        String randomName = adjectives[randomAdj] + "-" + nouns[randomNoun];
        return message + randomName;
    }


}
