package LeetCode;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LongestCommonPrefixTest {

  private LongestCommonPrefix classUnderTest = new LongestCommonPrefix();

  @Test
  public void test1() {
    String[] input = {"flower","flow","flight"};
    assertThat(classUnderTest.longestCommonPrefix(input), is("fl"));
  }

  @Test
  public void test2() {
    String[] input = {"dog","racecar","car"};
    assertThat(classUnderTest.longestCommonPrefix(input), is(""));
  }

  @Test
  public void test3() {
    String[] input = {"flower","flow","flight", "fence"};
    assertThat(classUnderTest.longestCommonPrefix(input), is("f"));
  }

  @Test
  public void test4() {
    String[] input = {"cir","car"};
    assertThat(classUnderTest.longestCommonPrefix(input), is("c"));
  }
}