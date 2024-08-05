import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StringConsumerExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");

        // Create a Consumer to print each string in uppercase
        Consumer<String> printUppercase = s -> System.out.println(s.toUpperCase());

        // Apply the Consumer to each element in the list
        strings.forEach(printUppercase);
    }
}
