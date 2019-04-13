import sun.jvm.hotspot.utilities.Assert;

public class StringsEx {

  //public static void main(String[] args) {

//  public static void main(String[] s) {
//    String str = "test";
//    StringBuilder sb = new StringBuilder(str);
//    String rev = sb.reverse().toString();
//    System.out.println(rev);
//  }

    public static void reverse(String str3) {
    String str = "";
    StringBuilder str1 = new StringBuilder();
    str1.append(str);
    str1 = str1.reverse();
    System.out.println(str1);
  }



  public String reverse1(String original) {


      return new StringBuilder(original).reverse().toString();
  }




//
//  public static String reverse(String a) {
//    char[] rarray = a.toCharArray();
//    String finalvalue = "";
//    for (int i = 0; i < rarray.length; i++) {
//      finalvalue += rarray[rarray.length - 1 - i];
//    }
//    return finalvalue;
//  }



//  public static void revese() {
//    String str = "Hello world";
//    StringBuilder str1 = new StringBuilder();
//    str1.append(str);
//    str1 = str1.reverse();
//    System.out.println(str1);
//
//  }


}