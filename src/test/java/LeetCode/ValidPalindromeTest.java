package LeetCode;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ValidPalindromeTest {

  private final ValidPalindrome classUnderTest = new ValidPalindrome();

  @Test
  public void testPalindrome() {
    String str = "A man, a plan, a canal: Panama";
    assertThat(classUnderTest.isPalindrome(str)).isTrue();
  }

  @Test
  public void testNotPalindrome() {
    String str = "race a car";
    assertThat(classUnderTest.isPalindrome(str)).isFalse();
  }

  @Test
  public void testBlank() {
    String str = "  ";
    assertThat(classUnderTest.isPalindrome(str)).isTrue();
  }
}