import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatingWords {

  static void repeatingWords(String str) {


    String[] words = str.split(" ");
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    for (String word : words) {
      if (map.containsKey(word)) {
        map.put(word, map.get(word) + 1);
      } else {
        map.put(word, 1);
      }
    }
    System.out.println(map);

  }


  public static void main(String args[]){
    repeatingWords("I am Java Programmer and IT Server Programmer with Java as Best Java lover");

  }

}