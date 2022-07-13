package LeetCode;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class RemoveDuplicatesFromSortedArrayTest {

  private final RemoveDuplicatesFromSortedArray classUnderTest = new RemoveDuplicatesFromSortedArray();

  @Test
  public void test1() {
    int[] array = new int[]{1,1,2};
    int result = classUnderTest.removeDuplicates(array);
    assertThat(result).isEqualTo(2);
    assertThat(array[0]).isEqualTo(1);
    assertThat(array[1]).isEqualTo(2);
  }

  @Test
  public void test2() {
    int[] array = new int[]{0,0,1,1,1,2,2,3,3,4};
    int result = classUnderTest.removeDuplicates(array);
    assertThat(result).isEqualTo(5);
    assertThat(array[0]).isEqualTo(0);
    assertThat(array[1]).isEqualTo(1);
    assertThat(array[2]).isEqualTo(2);
    assertThat(array[3]).isEqualTo(3);
    assertThat(array[4]).isEqualTo(4);
  }
}