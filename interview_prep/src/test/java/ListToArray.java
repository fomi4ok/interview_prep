import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

  public static void main(String[] args)  {

    List<String> itemList = new ArrayList<String>();
    itemList.add("item1");
    itemList.add("item2");
    itemList.add("item3");
    String [] listArray = new String[itemList.size()];

    listArray = itemList.toArray(listArray);

    for (String s: listArray) {
      System.out.println(s);
    }

  }

  public void ArraytoList() {

  String[] stringArray = {"item 1", "item 2", "item 3", "item 4"};
  List<String> stringList = new ArrayList(Arrays.asList(stringArray));

        for (String listItem : stringList) {
    System.out.println(listItem);
  }
}




}
