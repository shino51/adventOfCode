package LeetCode;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class TwoSumTest {

  private TwoSum twoSum = new TwoSum();

  @Test
  public void dummy() {
    int[] nums = {2,7,11,15};
    int target = 9;
    int[] sum = twoSum.twoSum(nums, target);
    assertThat(sum[0], is(0));
    assertThat(sum[1], is(1));
  }
}