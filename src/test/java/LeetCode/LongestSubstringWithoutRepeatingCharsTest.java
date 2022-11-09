package LeetCode;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class LongestSubstringWithoutRepeatingCharsTest {
  
  private final LongestSubstringWithoutRepeatingChars classUnderTest = new LongestSubstringWithoutRepeatingChars();

  @Test
  public void test1() {
    String input = "abcabcbb";
    assertThat(classUnderTest.lengthOfLongestSubstring(input)).isEqualTo(3);
  }

  @Test
  public void test2() {
    String input = "bbbbb";
    assertThat(classUnderTest.lengthOfLongestSubstring(input)).isEqualTo(1);
  }

  @Test
  public void test3() {
    String input = "pwwkew";
    assertThat(classUnderTest.lengthOfLongestSubstring(input)).isEqualTo(3);
  }

  @Test
  public void whenStringIsEmpty() {
    String input = "";
    assertThat(classUnderTest.lengthOfLongestSubstring(input)).isEqualTo(0);
  }

  @Test
  public void whenAllUnique() {
    String input = "au";
    assertThat(classUnderTest.lengthOfLongestSubstring(input)).isEqualTo(2);
  }
}