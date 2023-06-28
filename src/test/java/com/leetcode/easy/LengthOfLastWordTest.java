package com.leetcode.easy;

import com.leetcode.easy.LengthOfLastWord;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class LengthOfLastWordTest {

  private final LengthOfLastWord classUnderTest = new LengthOfLastWord();

  @Test
  public void test1() {
    assertThat(classUnderTest.lengthOfLastWord("Hello World")).isEqualTo(5);
    assertThat(classUnderTest.lengthOfLastWord("   fly me   to   the moon  ")).isEqualTo(4);
  }
}