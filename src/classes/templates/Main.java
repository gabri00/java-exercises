package classes.templates;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, Integer> pInt= new Pair<>(1, 2);
        Pair<String, String> pString = new Pair<>("string1", "string2");

        System.out.println("First int: " + pInt.getFirst());
        System.out.println("Second int: " + pInt.getSecond());
        System.out.println("First string: " + pString.getFirst());
        System.out.println("Second string: " + pString.getSecond());

        // Wrapper classes:
        //      byte -> Byte
        //      short -> Short
        //      int -> Integer
        //      long -> Long
        //      float -> Float
        //      double -> Double
        //      char -> Character
        //      boolean -> Boolean
    }
}
