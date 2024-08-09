import java.util.List;
import java.util.Optional;

public class MaxValueFinder {
    public static Optional<Integer> findMaxValue(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return Optional.empty(); // Return an empty Optional if the list is empty
        }
        int maxValue = numbers.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElseThrow(); // Get the maximum value or throw an exception (you can customize this behavior)

        return Optional.of(maxValue);
    }

    public static void main(String[] args) {
        List<Integer> numberList = List.of(10, 5, 8, 15, 3);
        Optional<Integer> maxOptional = findMaxValue(numberList);

        maxOptional.ifPresent(max -> System.out.println("Maximum value: " + max));
    }
}
