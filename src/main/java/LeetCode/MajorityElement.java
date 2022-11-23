package LeetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class MajorityElement {
  public int majorityElement(int[] nums) {
    Map<Integer, Integer> map = Arrays.stream(nums)
      .boxed()
      .collect(
        Collectors.groupingBy(
          e -> e,
          Collectors.reducing(0, e -> 1, Integer::sum)
        )
      );

    return Collections.max(map.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
  }
}
