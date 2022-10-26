package LeetCode;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class FirstBadVersionTest {

  private final FirstBadVersion classUnderTest = new FirstBadVersion();

  @Test
  public void test1() {
    int n = 5;
    int bad = 4;

    assertThat(classUnderTest.solution(n, bad)).isTrue();
  }

  @Test
  public void testEven() {
    int n = 6;
    int bad = 4;

    assertThat(classUnderTest.solution(n, bad)).isTrue();
  }

  @Test
  public void testOnlyOneInput() {
    int n = 1;
    int bad = 1;

    assertThat(classUnderTest.solution(n, bad)).isTrue();
  }
}