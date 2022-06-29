package LeetCode;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ValidParenthesesTest {

  private ValidParentheses classUnderTest = new ValidParentheses();

  @Test
  public void test() {
//    assertThat(classUnderTest.isValid("()")).isTrue();
//    assertThat(classUnderTest.isValid("()[]{}")).isTrue();
//    assertThat(classUnderTest.isValid("(]")).isFalse();
//    assertThat(classUnderTest.isValid("{[]}")).isTrue();
//    assertThat(classUnderTest.isValid("([)]")).isFalse();
//    assertThat(classUnderTest.isValid("([]){}")).isTrue();
    assertThat(classUnderTest.isValid("((")).isFalse();
  }
}