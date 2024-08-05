import java.util.function.Function;

public class CircleAreaExample {
    public static void main(String[] args) {
        // Define a Function to calculate the area of a circle
        Function<Double, Double> calculateArea = radius -> Math.PI * radius * radius;

        // Input radius (e.g., 5.0)
        double radius = 5.0;

        // Calculate the area using the Function
        double area = calculateArea.apply(radius);

        System.out.println("Area of the circle with radius " + radius + " is " + area);
    }
}
