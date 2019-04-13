import java.util.HashMap;


//find two elements of an int array that add to a sum.
public class TwoSumProblem {

//  public boolean sumsToTarget(int[] arr, int k) {
//    for (int i = 0; i < arr.length; i++) {
//      for (int j = i + 1; j < arr.length; j++) {
//        if (arr[i] + arr[j] == k) {
//          return true;
//        }
//      }
//    }
//    return false;
//  }
//}
//
//
//  private boolean sumsToTarget(int[] arr, int k) {
//    HashSet<Integer> values = new HashSet<Integer>();
//    for (int i = 0; i < arr.length; i++) {
//      if (values.contains(k - A[i])) return true;
//      values.add(A[i]);
//    }
//    return false;
//  }


  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    int complement;
    //loop to check every element in the array
    for (int i = 0; i<nums.length; i++) {
      complement = target - nums[i];
      //if we already have the complement in RepeatingWords,
      //return an array that contains indices of them.
      if (map.containsKey(complement)) {
        return new int[] {i, map.get(complement)};
      }
      //if its complement is not in RepeatingWords but in the array,
      //they will be matched when the complement is
      //regarded as current element.
      //add current element into RepeatingWords.
      map.put(nums[i], i);
    }
    //Exception which says it is unavailable to find solution
    //with these arguments.
    throw new IllegalArgumentException("No solution");
  }
}