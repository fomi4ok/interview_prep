public class Arrays {
  //This pair13() example method returns true if the int array contains a pair of 13's next to each other.
//
  public boolean pair13(int[] nums) {
    int count = 0;
    for (int i = 0; i < (nums.length - 1); ++i) {
      if (nums[i] == 13 && nums[i + 1] == 13)
        return true;
    }
    return false;

  }

  ///This new6() method makes and returns a new int array of size N that is filled with the value 6.

  public int[] new6(int n) {
    int[] result = new int[n];
    for (int i = 0; i < result.length; i++) {
      result[i] = 6;
    }
    return result;
  }


  // Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.


  public int[] rotate(int[] nums) {

    int[] new1 = new int[nums.length];//make new array same size as nums
    for (int i = 0; i < nums.length; i++) {
      new1[i] = nums[i];//copy all data

    }
    new1[0] = nums[1];
    new1[1] = nums[0];
    new1[2] = nums[2];
    return new1;
}

//Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.

  public int[] maxEnd3(int[] nums) {
    int[] new1 = new int[nums.length];//make new array same size as nums
    for (int i = 0; i < nums.length; i++) {
      if (nums[0] >= nums[2]) {
        new1[0] = nums[0];
        new1[1] = nums[0];
        new1[2] = nums[0];
      }
      else if (nums[0] < nums[2]) {
        new1[0] = nums[2];
        new1[1] = nums[2];
        new1[2] = nums[2];

      }
    }
    return new1;
  }

//Given an array of ints, return the sum of the first 2 elements in the array.
// If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
  public int sum2(int[] nums)
  {
    if(nums.length >= 2)
      return (nums[0] + nums[1]);
    if(nums.length == 1)
      return nums[0];
    return 0;
  }
  //Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
  public int[] middleWay(int[] a, int[] b) {
    int[] newArray = new int[2];
    newArray[0] = a[1];
    newArray[1] = b[1];
    return newArray;

  }

  public int[] makeLast(int[] nums) {
    int[] newArray = new int [nums.length*2];
    for (int i =0; i < newArray.length; i ++ ) {
      newArray[i] =0;
      if (nums.length >= 1) {
        newArray[newArray.length -1] = nums[nums.length-1];
      }
    }
    return newArray;
  }

  public boolean double23(int[] nums)
  {
    if(nums.length == 2)
    {
      if(nums[0] == 2 && nums[1] == 2)
        return true;
      return (nums[0] == 3 && nums[1] == 3);
    }
    return false;
}

    public static void main(String args[]) {
    String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" }; // First solution : finding duplicates using brute force method System.out.println("Finding duplicate elements in array using brute force method");
      for (int i = 0; i < names.length; i++) {
        for (int j = i + 1; j < names.length; j++) {
          if (names[i].equals(names[j])) { // got the duplicate element } } }


          }

        } }}


}