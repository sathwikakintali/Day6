import java.util.function.BiFunction;

public class StringConcatinationExample {
    public static void main(String[] args) {
        // Define a BiFunction to concatenate two strings with a space in between
        BiFunction<String, String, String> concatenateStrings = (s1, s2) -> s1 + " " + s2;

        // Input strings
        String str1 = "Hello";
        String str2 = "World";

        // Concatenate the strings using the BiFunction
        String result = concatenateStrings.apply(str1, str2);

        System.out.println("Concatenated string: " + result);
    }
}
