import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StudentsAndCourses {
    public static void main(String[] args)
    {

      HashMap<Integer, ArrayList<String>> hmap = new HashMap<Integer, ArrayList<String>>();

     /*Adding elements to RepeatingWords*/
      hmap.put(1, new ArrayList<String>(Arrays.asList("Math", "History", "Biology")));

      hmap.put(2, new ArrayList<String>(Arrays.asList("Math", "History")));

      hmap.put(3, new ArrayList<String>(Arrays.asList("History", "Biology")));

      //System.out.println(hmap);

      ArrayList<String> unique = new ArrayList<String>();
      HashMap<ArrayList<Integer>, ArrayList<String>> map = new HashMap<ArrayList<Integer>, ArrayList<String>>();


      for(Map.Entry <Integer, ArrayList<String>> entry : hmap.entrySet()) {
        Integer key = entry.getKey();
        ArrayList<String> value = entry.getValue();

        for (String s: entry.getValue()) {
          if (value.contains(s)) {
            //map.put(hmap.get(s).contains(s), s); }
             // else {
                unique.add(s);
              }
            }
          System.out.println();

        } }


//        System.out.println("Student ID: " + key);
//        System.out.println("Course: " + value);
      }


  //https://javafiddle.leaningtech.com/
         // this is just listing every student and his / her course

///Similar to this
// Variable names edited for readability
//for (String item : pinkList) {
//        if (normalList.contains(item)) {
//        duplicateList.add(item);
//        } else {
//        uniqueList.add(item);
//        }
//        }
//        Example above has two lists: pinkList and normalList
//        You will have two lists as well. One list: classes for student 1, another list: classes for student 2


///you can create a function that takes two student IDs
           // and the find common course between them


            //something like this findCommonCourse(1,2)