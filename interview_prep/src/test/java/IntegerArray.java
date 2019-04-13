import java.util.*;

public class IntegerArray {


  //how to find the first non-repetitive characters in the String
  // 3*3 matrix given. print the row with max. sum and column with max sum

//  Find the duplicates in an integer array?

  public void dups(int[] num) {

    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    for (Integer n : num) {
      if (map.containsKey(n)) {
        map.put(n, map.get(n) + 1);
      } else {
        map.put(n, 1);
      }
    }

    Set<Integer> nums = map.keySet();
    for (Integer n : nums) {

      if (map.get(n) > 1) {
        System.out.println("Duplicate elements " + (n) + ":" + map.get(n));
      }
    }


//      Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
//      for (Map.Entry<Integer, Integer> n : entrySet) {
//        if (map.get(n) > 1) {
//          System.out.println("Duplicate elements " + map.get(n));
//        }
//      }

  }


  public static void main(String[] args) {
    IntegerArray repeat = new IntegerArray();
    int[] arr = {4, 2, 4, 5, 2, 3, 1, 5, 5, 5};

    repeat.dups(arr);
    repeat.unique(arr);

    ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));

    // Print the Arraylist
    System.out.println("ArrayList with duplicates: " + list);

    // Remove duplicates
    ArrayList<Integer> newList = removeDuplicates(list);

    // Print the ArrayList with duplicates removed
    System.out.println("ArrayList with duplicates removed: " + newList);
  }


//  Find the unique numbers in an integer array?

  public void unique(int[] nums) {

    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    for (Integer num : nums) {
      if (map.containsKey(num)) {
        map.put(num, map.get(num) + 1);
      } else {
        map.put(num, 1);
      }
    }

    for (Integer key : map.keySet()) {

      if (map.get(key) == 1) {

        System.out.println(" Unique characters are: " + key);
      }
    }
  }


  // Function to remove duplicates from an ArrayList
  public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list)
  {
    // Create a new LinkedHashSet
    Set<T> set = new LinkedHashSet<T>();

    // Add the elements to set
    set.addAll(list);

    // Clear the list
    list.clear();

    // add the elements of set
    // with no duplicates to the list
    list.addAll(set);

     return list;
  }
}





