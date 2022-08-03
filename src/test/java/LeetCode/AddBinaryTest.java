package LeetCode;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AddBinaryTest {

  private final AddBinary classUnderTest = new AddBinary();

  @Test
  public void test() {
    String result = classUnderTest.addBinary("1", "11");
    assertThat(result).isEqualTo("100");
  }

  @Test
  public void test2() {
    String result = classUnderTest.addBinary("1010", "1011");
    assertThat(result).isEqualTo("10101");
  }
}