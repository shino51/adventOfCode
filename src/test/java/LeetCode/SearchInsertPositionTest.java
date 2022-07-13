package LeetCode;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class SearchInsertPositionTest {

  private final SearchInsertPosition classUnderTest = new SearchInsertPosition();

  @Test
  public void test1() {
    int[] nums = new int[] {1,3,5,6};
    int index = classUnderTest.searchInsert(nums, 5);
    assertThat(index).isEqualTo(2);
  }

  @Test
  public void test2() {
    int[] nums = new int[] {1,3,5,6};
    int index = classUnderTest.searchInsert(nums, 2);
    assertThat(index).isEqualTo(1);
  }
}