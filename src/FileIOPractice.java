import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static java.util.Set.*;

public class FileIOPractice {

    public static void main(String[] args) {
        Path pathToPeople = Paths.get("src","fileIo", "people");
        List<String> people = new ArrayList<>();
        try {
            people = Files.readAllLines(pathToPeople);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String name : people) {
            System.out.println(name + " works at CodeUp");
        }

//        List<String> peopleInBreakoutRoom = Arrays.asList("Colin", "William", "Javier", "Jacob");
//        try {
//            Files.write(pathToPeople, peopleInBreakoutRoom);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

    public static void deleteEntry(String name) {

    }
}
