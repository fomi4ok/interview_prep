
//How to Remove Duplicates from ArrayList in Java

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDups {

  public static ArrayList<Integer> removedups(ArrayList<Integer> list) {

    ArrayList<Integer> newList = new ArrayList<Integer>();

    for (Integer s : list) {
      if (!newList.contains(s)) {
        newList.add(s);
      }

    }
    return newList;


  }


  // Function to remove duplicates from an ArrayList
  public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {

    // Create a new LinkedHashSet
    Set<T> set = new LinkedHashSet<>();

    // Add the elements to set
    set.addAll(list);

    // Clear the list
    list.clear();

    // add the elements of set
    // with no duplicates to the list
    list.addAll(set);

    // return the list
    //
    return list;

  }


  //Remove duplicates from a given string

  public static void rems (String str ) {

    LinkedHashSet<Character> link = new LinkedHashSet<>();

    // char[] ch = str.toCharArray();

    for (int i= 0; i < str.length(); i++) {
      link.add(str.charAt(i));
    }

    for (Character c : link) {
      System.out.println(c);

    }
  }
    public static void main(String[] args) {

      rems("Street");



  }



  }


