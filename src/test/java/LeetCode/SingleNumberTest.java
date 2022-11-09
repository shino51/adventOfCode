package LeetCode;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SingleNumberTest {

  private final SingleNumber classUnderTest = new SingleNumber();

  @Test
  public void whenInputHas3Element() {
    int[] input = {2, 2, 1};
    assertThat(classUnderTest.singleNumber(input)).isEqualTo(1);
  }

  @Test
  public void whenInputHas5Elements() {
    int[] input = {4, 1, 2, 1, 2};
    assertThat(classUnderTest.singleNumber(input)).isEqualTo(4);
  }

  @Test
  public void whenInputHasOneElement() {
    int[] input = {1};
    assertThat(classUnderTest.singleNumber(input)).isEqualTo(1);
  }
}