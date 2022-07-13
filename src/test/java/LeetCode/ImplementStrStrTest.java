package LeetCode;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ImplementStrStrTest {

  private final ImplementStrStr classUnderTest = new ImplementStrStr();

  @Test
  public void test1() {
    assertThat(classUnderTest.strStr("hello", "ll")).isEqualTo(2);
    assertThat(classUnderTest.strStr("aaaaa", "bba")).isEqualTo(-1);
  }

}