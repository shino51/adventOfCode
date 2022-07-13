package LeetCode;

public class RemoveDuplicatesFromSortedArray {
  public int removeDuplicates(int[] nums) {
    int index = 0;
    for(int i = 0; i < nums.length; i++) {
      if (index+1 > nums.length) {
        break;
      }
      if (nums[index] != nums[i]) {
        index++;
        nums[index] = nums[i];
      }
    }
    return index+1;
  }
}
