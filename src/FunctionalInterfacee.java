@FunctionalInterface
interface SquareFunction {
    int square(int x);
    default void printSquare(int x) {
        int result = square(x);
        System.out.println("The square of " + x + " is " + result);
    }
}

public class FunctionalInterfacee {
    public static void main(String[] args) {
        SquareFunction square = x -> x * x;
        int number = 5;
        square.printSquare(number);
    }
}
