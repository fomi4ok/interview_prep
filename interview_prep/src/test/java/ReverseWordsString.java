import org.junit.Assert;
import org.junit.Test;


public class ReverseWordsString {

  // reverse a string
  public String reverse(String original) {

    return new StringBuilder(original).reverse().toString();
  }

  public String reverseAp(String s) {

    StringBuilder str = new StringBuilder();
    str.append(s);
    str = str.reverse();
    return str.toString();
  }

  public String reverseBackwords(String str) {
    String backward = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      backward += str.substring(i, i + 1);
    }
    return backward;
  }


  public  String firstReverse(String str) {
      char[] arr = str.toCharArray();
      String reverse = "";
      for (int i = arr.length - 1; i >= 0; i--) {
        reverse += arr[i];
      }
      return reverse;
  }

  // reverse words in string
  public String stringReverse(String stri) {
    String[] arr = stri.split(" ");
    String reversedWords = "";

    for (int i = 0; i < arr.length; i++) {
      if (i == 0) {
        reversedWords += arr[arr.length - 1 - i] + " ";

      } else {
        reversedWords += arr[arr.length - 1 - i];

      }
    }
    return reversedWords;
  }

    public String stringReverse1(String s) {
      String[] arr = s.split(" ");
      String reversedWords = "";

      for (int i = arr.length - 1; i >= 0; i--) {
        if (i != 0) {
          reversedWords += arr[i] + " ";
        } else {
          reversedWords += arr[i];
        }
      }
      return  reversedWords;

  }

// reverse every word in a String
  public String reverseLettersEachWord (String str) {

    String[] words = str.split(" ");
    String reversedString = "";

    for (int i = 0; i < words.length ; i++) {

        String word = words[i];
        String reverseWord = "";
        for (int j = word.length() -1; j >=0; j--) {
          reverseWord += word.charAt(j);
        }

        if (i != words.length-1) {

        reversedString += reverseWord+ " ";
        } else {
          reversedString += reverseWord;
        }

    }

    return reversedString;


  }


    @Test
    public void testReverseWord () {

      Assert.assertEquals("word is reversed", "eno tset", reverse("test one"));
      Assert.assertEquals("word is reversed", "eno tset", reverseBackwords("test one"));
      Assert.assertEquals("word is reversed", "tset", reverseAp("test"));
      Assert.assertEquals("word is reversed", "one test", stringReverse("test one"));
      Assert.assertEquals("word is reversed", "two one test", stringReverse1("test one two"));
      Assert.assertEquals("word is reversed", "tset eno owt", reverseLettersEachWord("test one two"));
      Assert.assertEquals("string is not reversed", "owt eno tset", firstReverse("test one two"));



    }

}