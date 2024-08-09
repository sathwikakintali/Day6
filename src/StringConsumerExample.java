import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StringConsumerExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
        Consumer<String> printUppercase = s -> System.out.println(s.toUpperCase());
        strings.forEach(printUppercase);
    }
}
