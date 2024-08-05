import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    private String name;
    private int age;
    private double salary;

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

public class PersonSortingExample {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Alice", 30, 50000.0));
        personList.add(new Person("Bob", 25, 60000.0));
        personList.add(new Person("Charlie", 22, 55000.0));

        // Sort by age in ascending order using lambda expression
        Collections.sort(personList, Comparator.comparingInt(Person::getAge));

        // Print the sorted list
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}
