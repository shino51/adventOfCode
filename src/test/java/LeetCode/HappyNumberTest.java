package LeetCode;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HappyNumberTest {

  private final HappyNumber classUnderTest = new HappyNumber();

  @Test
  public void whenNumberIsOne() {
    int input = 1;
    boolean isHappy = classUnderTest.isHappy(input);
    assertThat(isHappy).isTrue();
  }

  @Test
  public void whenNumberIsTwo() {
    int input = 2;
    boolean isHappy = classUnderTest.isHappy(input);
    assertThat(isHappy).isFalse();
  }

  @Test
  public void whenNumberIs19HappyNumber() {
    int input = 19;
    boolean isHappy = classUnderTest.isHappy(input);
    assertThat(isHappy).isTrue();
  }
}