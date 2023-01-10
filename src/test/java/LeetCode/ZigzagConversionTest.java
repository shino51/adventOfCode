package LeetCode;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ZigzagConversionTest {

  private static final ZigzagConversion classUnderTest = new ZigzagConversion();

  @Test
  public void onlyOneInput() {
    String input = "P";
    int numRows = 3;

    String result = classUnderTest.convert(input, numRows);
    assertThat(result).isEqualTo("P");
  }

  @Test
  public void valueAndRowNumbersAreSame() {
    String input = "ABC";
    int numRows = 3;

    String result = classUnderTest.convert(input, numRows);
    assertThat(result).isEqualTo("ABC");
  }

  @Test
  public void twoRows() {
    String input = "ABCDE";
    int numRows = 2;

    String result = classUnderTest.convert(input, numRows);
    assertThat(result).isEqualTo("ACEBD");
  }

  @Test
  public void threeRows() {
    String input = "ABCDEFGHIJ";
    int numRows = 3;

    String result = classUnderTest.convert(input, numRows);
    assertThat(result).isEqualTo("AEIBDFHJCG");
  }

  @Test
  public void onlyOneRow() {
    String input = "PAYPALISHIRING";
    int numRows = 1;

    String result = classUnderTest.convert(input, numRows);
    assertThat(result).isEqualTo(input);
  }
}