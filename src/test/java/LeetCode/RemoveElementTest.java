package LeetCode;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class RemoveElementTest {

  private final RemoveElement classUnderTest = new RemoveElement();

  @Test
  public void test() {
    int[] nums = new int[] {3,2,2,3};
    int val = 3;
    int finalLength = classUnderTest.removeElement(nums, val);
    assertThat(finalLength).isEqualTo(2);

    int[] sortedNum = sortForAnswer(nums, finalLength);
    assertThat(sortedNum[0]).isEqualTo(2);
    assertThat(sortedNum[1]).isEqualTo(2);
  }

  @Test
  public void test2() {
    int[] nums = new int[] {0,1,2,2,3,0,4,2};
    int val = 2;

    int finalLength = classUnderTest.removeElement(nums, val);
    assertThat(finalLength).isEqualTo(5);

    int[] sortedNum = sortForAnswer(nums, finalLength);
    // nums = [0,0,1,3,4]
    assertThat(sortedNum[0]).isEqualTo(0);
    assertThat(sortedNum[1]).isEqualTo(0);
    assertThat(sortedNum[2]).isEqualTo(1);
    assertThat(sortedNum[3]).isEqualTo(3);
    assertThat(sortedNum[4]).isEqualTo(4);
  }

  private int[] sortForAnswer(int[] num, int length) {
    int[] result = Arrays.copyOfRange(num,0,length);
    Arrays.sort(result);
    return result;
  }
}