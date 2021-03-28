package lectures;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIOLecture {

    public static void main(String[] args) {
        // lecture notes not fixed yet
        // ============================ PATH

        // what is the relative to test.txt?
        //    cat src/lectures/FileIO/test.txt
        // pwd: to see where you are

        // when you want to create a path you do type Path
        // Path pathToTest = Paths.get("src/lectures/test.txt");
        Path pathToTest = Paths.get("src","lectures","test.txt"); // best practice for all systems
        System.out.println(pathToTest);
        // Start at the root. src is the root
        // then drop from directories


//        Path fileLecturePath = Paths.get("src", "fileIoLecture", "FileIOLecture.java");
//
//        System.out.println(fileLecturePath);
//        System.out.println(fileLecturePath.toAbsolutePath());

//        Path otherPath = Paths.get("src", "../", "src", "../", "src", "fileIoLecture", "FileIOLecture");
//        System.out.println(otherPath);
//        System.out.println(otherPath.normalize());
//        System.out.println(otherPath.toAbsolutePath());
//        System.out.println(otherPath.normalize().toAbsolutePath());

        // ============================ FILE METHODS
//          to see if the file exist
//        System.out.println(Files.exists(fileLecturePath));
//        System.out.println(Files.exists(Paths.get("bob.txt"))); // false because it doesn't exist
//
//        String directory = "data"; // data folder
//        String filename = "info.txt"; // filename
//        Path dataDirectory = Paths.get(directory); // get path of directory prints out data
//        Path dataFile = Paths.get(directory, filename); // puts it all together prints out data/info.txt
////
//        System.out.println(dataDirectory);
//        System.out.println(dataFile);
//
//        if (!Files.exists(dataDirectory)) { if it doesn't exist
//            try {
//                Files.createDirectories(dataDirectory); then create the directory (this will create an empty directory)
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//        if (!Files.exists(dataFile)) { if the file doesn't exist
//            try {
//                Files.createFile(dataFile); then create the file
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }


        // ============================ READING FILES

        // step 1: to read a file you have to create the path
//        Path p = Paths.get("src/fileIoLecture/test.txt");
//          you can then pull out an array list of string
        // step 2: create an empty array list

//        List<String> lines = new ArrayList<>();
//
//        try {
//            lines = Files.readAllLines(p); // could throw IO exception if nothing in the file then you wll get an empty string
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//      //
//        System.out.println(lines);
//      // now you can manipulate and treat it as an array list of strings
//        for (String name : lines) {
//            System.out.println("Hello, " + name + "!");
//        }



//        try {
//            List<String> contents = Files.readAllLines(
//                Paths.get("data", "bob.txt")
//            );
//            for (String line : contents) {
//                System.out.println(line);
//            }
//        } catch (Exception e) {
//            System.out.println("Exception!");
//            e.printStackTrace();
//        }



        // ============================ WRITING FILES

//        Path p = Paths.get("src/fileIoLecture/test.txt");
//
//        List<String> newNames = Arrays.asList("John", "Fred", "Cathy");
//        try {
//            Files.write(p, newNames); // each element in the list will be a line in the file. .write() overriding files with new content
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        List<String> names = new ArrayList<>();
//        names.add("Tim");
//        names.add("Sally");
//        names.add("Mary");
//        try {
//            Files.write(p, names, StandardOpenOption.APPEND);
//        } catch(IOException e) {
//            e.printStackTrace();
        //}
    }

}
