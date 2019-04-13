import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList4 {

  public static void main(String args[]){

  ArrayList<String> list  = new ArrayList<String>();
    list.add("Ravi");//Adding object in arraylist
    list.add("Vijay");
    list.add("Ravi");
    list.add("Ajay");

    for(int i=0;i<list.size();i++)
    {
      System.out.println(list.get(i));
    }

    ListIterator<String> list1=list.listIterator(list.size());
    while(list1.hasPrevious())
    {
      String str=list1.previous();
      System.out.println(str);
    }

    list.forEach(a->{ //Here, we are using lambda expression
      System.out.println(a);
    });

    Iterator<String> itr=list.iterator();
    itr.forEachRemaining(a-> //Here, we are using lambda expression
    {
      System.out.println(a);
    });



  }
  }
