package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchInsertPosition {
  public int searchInsert(int[] nums, int target) {
    if(nums[0] > target) return 0;
    List<Integer> list = new ArrayList<>(Arrays.stream(nums).boxed().toList());
    list.add(target);
    List<Integer> addedTarget = list.stream().sorted().toList();
    return addedTarget.indexOf(target);
  }
}
