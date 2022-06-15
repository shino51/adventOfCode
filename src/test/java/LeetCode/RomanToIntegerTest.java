package LeetCode;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class RomanToIntegerTest {

  private RomanToInteger classUnderTest = new RomanToInteger();

  @Test
  public void test() {
    assertThat(classUnderTest.romanToInt("III"), is(3));
    assertThat(classUnderTest.romanToInt("IV"), is(4));
    assertThat(classUnderTest.romanToInt("LVIII"), is(58));
    assertThat(classUnderTest.romanToInt("MCMXCIV"), is(1994));
  }
}