package LeetCode;

public class BinarySearch {
  public int search(int[] nums, int target) {
    return binarySearch(nums, 0, nums.length-1, target);
  }
  private int binarySearch(int[] nums, int firstIndex, int lastIndex, int target) {
    if (firstIndex <= lastIndex) {
      int midNum = firstIndex + (lastIndex - firstIndex)/ 2;
      int num = nums[midNum];
      if (num == target) {
        return midNum;
      } else if (num < target) {
        return binarySearch(nums, midNum + 1, lastIndex, target);
      }
      return binarySearch(nums, firstIndex, midNum - 1, target);
    }
    return -1;
  }
}
