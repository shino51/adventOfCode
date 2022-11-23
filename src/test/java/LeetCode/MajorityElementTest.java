package LeetCode;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class MajorityElementTest {

  private final MajorityElement classUnderTest = new MajorityElement();

  @Test
  public void test() {
    int[] input = new int[]{3, 2, 3, 4, 5, 6};
    assertThat(classUnderTest.majorityElement(input)).isEqualTo(3);
  }

  @Test
  public void test2() {
    int[] input = new int[]{2, 2, 1, 1, 1, 2, 2};
    assertThat(classUnderTest.majorityElement(input)).isEqualTo(2);
  }
}