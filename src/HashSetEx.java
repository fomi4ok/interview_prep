import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
public class HashSetEx {

  public static void tmain (String[] args) {

         // Creating a HashSetEx
        Set<String> daysOfWeek = new HashSet<>();

        // Adding new elements to the HashSet
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        // Adding duplicate elements will be ignored
        daysOfWeek.add("Monday");

        System.out.println(daysOfWeek);
      }

  public static void main (String[] args) {

    List<Integer> numbersDivisibleBy5 = new ArrayList<>();
    numbersDivisibleBy5.add(5);
    numbersDivisibleBy5.add(10);
    numbersDivisibleBy5.add(15);
    numbersDivisibleBy5.add(20);
    numbersDivisibleBy5.add(25);

    List<Integer> numbersDivisibleBy3 = new ArrayList<>();
    numbersDivisibleBy3.add(3);
    numbersDivisibleBy3.add(6);
    numbersDivisibleBy3.add(9);
    numbersDivisibleBy3.add(12);
    numbersDivisibleBy3.add(15);

    // Creating a HashSet from another collection (ArrayList4)
    Set<Integer> numbersDivisibleBy5Or3 = new HashSet<>(numbersDivisibleBy5);

    // Adding all the elements from an existing collection to a HashSet
    numbersDivisibleBy5Or3.addAll(numbersDivisibleBy3);

    System.out.println(numbersDivisibleBy5Or3);
  }

}



