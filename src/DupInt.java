import java.util.HashMap;

//Given an array, find the first duplicate element.
public class DupInt {

//  public int[] dups (int[] num) {
//    if (num.length >= 2) {
//      for (int i = 0; i < num.length; i++) {
//        if (num[i] == num[i + 1]) {
//          System.out.println(num[i]);
//          break;
//        } else {
//          System.out.println("no dups");
//        }
//      }
//    }}

 // Write code to count the duplicate characters in a given string.

 public static void dups(String str) {

    char[] dup = str.toCharArray();

   HashMap<Character, Integer> map = new HashMap<>();
   for (Character s: dup) {
     if (map.containsKey(s)) {
       map.put(s, map.get(s) + 1);
     } else {
       map.put(s, 1);


     }}}  }