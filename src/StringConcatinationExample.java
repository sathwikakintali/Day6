import java.util.function.BiFunction;

public class StringConcatinationExample {
    public static void main(String[] args) {
        BiFunction<String, String, String> concatenateStrings = (s1, s2) -> s1 + " " + s2;
        String str1 = "Hello";
        String str2 = "World";
        String result = concatenateStrings.apply(str1, str2);
        System.out.println("Concatenated string: " + result);
    }
}
