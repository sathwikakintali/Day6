import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringFilterExample {
    public static void main(String[] args) {
        List<String> originalList = Arrays.asList(
                "apple", "banana", "grape", "pineapple", "orange", "kiwi");
        Predicate<String> lengthGreaterThan5 = s -> s.length() > 5;
        Predicate<String> containsApple = s -> s.contains("apple");
        Predicate<String> combinedPredicate = lengthGreaterThan5.and(containsApple);
        List<String> filteredList = originalList.stream()
                .filter(combinedPredicate)
                .collect(Collectors.toList());
        System.out.println("Filtered list: " + filteredList);
    }
}
