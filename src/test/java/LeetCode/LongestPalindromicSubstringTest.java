package LeetCode;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LongestPalindromicSubstringTest {
  private final LongestPalindromicSubstring classUnderTest = new LongestPalindromicSubstring();

  @Test
  public void found3Palindrome() {
    String input = "babad";
    String output = classUnderTest.longestPalindrome(input);
    assertThat(output).isEqualTo("bab");
  }

  @Test
  public void found2Palindrome() {
    String input = "cbbd";
    String output = classUnderTest.longestPalindrome(input);
    assertThat(output).isEqualTo("bb");
  }

  @Test
  public void onlyOneLetter() {
    String input = "a";
    String output = classUnderTest.longestPalindrome(input);
    assertThat(output).isEqualTo("a");
  }

  @Test
  public void lastLettersArePalindrome() {
    String input = "dccc";
    String output = classUnderTest.longestPalindrome(input);
    assertThat(output).isEqualTo("ccc");
  }
  @Test
  public void longInput() {
    String input = "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111";
    String output = classUnderTest.longestPalindrome(input);
    assertThat(output).isEqualTo("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
  }
}