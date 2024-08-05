import java.util.*;
import java.util.function.BiFunction;
interface MyInterface{
    void SumOfIntegers();
}
class SumClass implements MyInterface
{
    @Override
  public void SumOfIntegers()
   {
       System.out.println("enter the 2 integer values :");
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       int y = sc.nextInt();
       int sum;
       BiFunction<Integer,Integer,Integer> SumIs = (a,b)-> a + b ;
       sum = SumIs.apply(x,y);
       System.out.println("their sum is :"+sum);
   }
}
public class FunctionalInterface {
    public static void main(String[] args) {
      SumClass obj = new SumClass();
      obj.SumOfIntegers();
    }
}
