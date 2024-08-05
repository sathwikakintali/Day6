import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringFilterExample {
    public static void main(String[] args) {
        List<String> originalList = Arrays.asList(
                "apple", "banana", "grape", "pineapple", "orange", "kiwi");

        // Create a Predicate for length greater than 5
        Predicate<String> lengthGreaterThan5 = s -> s.length() > 5;

        // Create a Predicate for containing the substring "apple"
        Predicate<String> containsApple = s -> s.contains("apple");

        // Combine the predicates using 'and' (&&)
        Predicate<String> combinedPredicate = lengthGreaterThan5.and(containsApple);

        // Filter the original list based on the combined predicate
        List<String> filteredList = originalList.stream()
                .filter(combinedPredicate)
                .collect(Collectors.toList());

        // Print the filtered list
        System.out.println("Filtered list: " + filteredList);
    }
}
