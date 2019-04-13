////amazon-interview-questions0
//of 0 votes
//        12
//        Answers
//        You are given a 3 * 3 Matrix -
//
//        3 -5 10
//        6 2 -1
//        2 6 1
//
//Find the sum of the elements of each rows, and each column, and then display row number \
// column number having the maximum sum and the minimum sum.
//
//


import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Matrix {

  public static void main(String[] args) {

    int[][] data = new int [3][3];

    data[0][0] = 3;
    data[0][1] = -5;
    data[0][2] = 10;

    data[1][0] = 6;
    data[1][1] = 2;
    data[1][2] = -1;

    data[2][0] = 2;
    data[2][1] = 6;
    data[2][2] = 1;

    HashMap<Integer, Integer> rows = new HashMap<Integer, Integer>();
    HashMap<Integer, Integer> cols = new HashMap<Integer, Integer>();

    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data[i].length; j++) {
        if (!rows.containsKey(i)) {
          rows.put(i, data[i][j]);
        } else {
          int val = data[i][j] + rows.get(i);
          rows.put(i, val);
        }
        if (!cols.containsKey(i)) {
          cols.put(i, data[j][i]);
        } else {
          int val = data[j][i] + cols.get(i);
          cols.put(i, val);
        }
      }

    }

    System.out.println(rows);
    System.out.println(cols);




    System.out.println(String.format("The Row: %d has the Min Sum %d", getMinIndex(rows), rows.get(getMinIndex(rows))));
    System.out.println(String.format("The Col: %d has the Min Sum %d", getMinIndex(cols), cols.get(getMinIndex(cols))));
    System.out.println(String.format("The Row: %d has the Max Sum %d", getMaxIndex(rows), rows.get(getMaxIndex(rows))));
    System.out.println(String.format("The Col: %d has the Max Sum %d", getMaxIndex(cols), cols.get(getMaxIndex(cols))));


  }

  private static int getMaxIndex(HashMap<Integer, Integer> map) {
    Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
    int max = entrySet.iterator().next().getValue();
    int index = entrySet.iterator().next().getKey();
    for (Map.Entry<Integer, Integer> entry : entrySet) {
      if (entry.getValue() > max) {
        max = entry.getValue();
        index = entry.getKey();
      }
    }
    return index;
  }

  private static int getMinIndex(HashMap<Integer, Integer> map) {
    Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
    int min = entrySet.iterator().next().getValue();
    int index = entrySet.iterator().next().getKey();
    for (Map.Entry<Integer, Integer> entry : entrySet) {
      if (entry.getValue() < min) {
        min = entry.getValue();
        index = entry.getKey();
      }
    }
    return index;
  }
}
