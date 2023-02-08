package LeetCode;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class IntegerToRomanTest {

  private final IntegerToRoman classUnderTest = new IntegerToRoman();

  @Test
  public void result1() {
    int input = 1;
    String result = classUnderTest.intToRoman(input);
    assertThat(result).isEqualTo("I");
  }

  @Test
  public void result3() {
    int input = 3;
    String result = classUnderTest.intToRoman(input);
    assertThat(result).isEqualTo("III");
  }

  @Test
  public void result4() {
    int input = 4;
    String result = classUnderTest.intToRoman(input);
    assertThat(result).isEqualTo("IV");
  }

  @Test
  public void result5() {
    int input = 5;
    String result = classUnderTest.intToRoman(input);
    assertThat(result).isEqualTo("V");
  }

  @Test
  public void result9() {
    int input = 9;
    String result = classUnderTest.intToRoman(input);
    assertThat(result).isEqualTo("IX");
  }

  @Test
  public void result58() {
    int input = 58;
    String result = classUnderTest.intToRoman(input);
    assertThat(result).isEqualTo("LVIII");
  }

  @Test
  public void result1994() {
    int input = 1994;
    String result = classUnderTest.intToRoman(input);
    assertThat(result).isEqualTo("MCMXCIV");
  }
}