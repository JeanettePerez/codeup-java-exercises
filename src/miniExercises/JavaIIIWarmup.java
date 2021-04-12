package miniExercises;

public class JavaIIIWarmup {

  public static boolean sameFirstAndLast(String str) {
    var first = Character.toLowerCase(str.charAt(0));
    var last = Character.toLowerCase(str.charAt(str.length() - 1));
    return first == last;
  }


  public static void main(String[] args) {
    System.out.println(sameFirstAndLast("bob"));
    System.out.println(sameFirstAndLast("trouble"));
    System.out.println(sameFirstAndLast("Bob"));
  }
}
