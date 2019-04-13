
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DuplicateHashMap {

  static void duplicate(String inputString){

    HashMap<String, Integer> wordCount = new HashMap<>();
    String[] words = inputString.split(" ");

    for(String word : words){
      if(wordCount.containsKey(word)){
        wordCount.put(word, wordCount.get(word)+1);
      }
      else{
        wordCount.put(word, 1);

      }
    }
    System.out.println(wordCount);
    //Extracting of all keys of word count
    Set<String> wordsInString = wordCount.keySet();

    for(String word : wordsInString){
      if(wordCount.get(word)>1){
        System.out.println(word+":"+wordCount.get(word));
      }
    }

  }
  public static void main(String args[]){
    duplicate("I am Java Programmer and IT Server Programmer with Java as Best Java lover");

  }


}
  // Write code to count the duplicate characters in a given string.

// Given an array, find the first duplicate element.
