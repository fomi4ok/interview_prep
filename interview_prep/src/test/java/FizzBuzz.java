import org.junit.Assert;
import org.junit.Test;

public class FizzBuzz {

  public String fizz = "fizz";
  public String buzz = "buzz";
  public String fizzbuzz = "fizzbuzz";

  public void fizz(int n) {

    for (int i= 1; i <= 100; i++) {

      if (i%15 == 0) {

        System.out.println(fizzbuzz); }
        else if (i%5 == 0) {
        System.out.println(buzz);}
        else if (i%3 ==0) {
        System.out.println(fizz);
      } else {
        System.out.println(i);


      }
    }
  }


//
//@Test
//
//   public void testFizz() {
//
//  Assert.assertEquals("", buzz, fizz(20));
//}
}