import java.util.HashMap;

public class HashMapAnagram {

  public static boolean isTwoWordsAreAnagram(String firstWord, String secondWord) {

    char[] wordOne = firstWord.toCharArray();
    char[] wordTwo = secondWord.toCharArray();

    HashMap<Character, Integer> map1 = new HashMap<>();

    for ( char letter1: wordOne) {
      if (map1.containsKey(letter1)) {
        map1.put(letter1, map1.get(letter1) +1);
      }
      else
        map1.put(letter1, 1);

    }

    HashMap<Character, Integer> map2 = new HashMap<>();

    for (char letter2: wordTwo) {
      if (map2.containsKey(letter2)) {
        map2.put(letter2, map2.get(letter2) +1);
      }
      else {
        map2.put(letter2, 1);
      }
    }

    if  (map1.equals(map2)) {
      System.out.println("true");

      return true;
    } else {
      System.out.println("false");

      return false;
    }


  }


  public static void main(String args[]){
    isTwoWordsAreAnagram("mom", "o9mm");

  }
}
