package LeetCode;

import LeetCode.Utils.ListNode;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class SwapNodesInPairsTest {

  private final SwapNodesInPairs classUnderTest = new SwapNodesInPairs();

  @Test
  public void testWith4Values() {
    ListNode root = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
    ListNode resultNode = classUnderTest.swapPairs(root);

    assertThat(resultNode.val).isEqualTo(2);
    assertThat(resultNode.next.val).isEqualTo(1);
    assertThat(resultNode.next.next.val).isEqualTo(4);
    assertThat(resultNode.next.next.next.val).isEqualTo(3);
  }

  @Test
  public void testWithSingleValue() {
    ListNode root = new ListNode(1);
    ListNode resultNode = classUnderTest.swapPairs(root);

    assertThat(resultNode.val).isEqualTo(1);
    assertThat(resultNode.next).isNull();
  }

  @Test
  public void testWithNullValue() {
    ListNode resultNode = classUnderTest.swapPairs(null);

    assertThat(resultNode).isNull();
  }

  @Test
  public void testWithOddNumberOfValue() {
    ListNode root = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
    ListNode resultNode = classUnderTest.swapPairs(root);

    assertThat(resultNode.val).isEqualTo(2);
    assertThat(resultNode.next.val).isEqualTo(1);
    assertThat(resultNode.next.next.val).isEqualTo(4);
    assertThat(resultNode.next.next.next.val).isEqualTo(3);
    assertThat(resultNode.next.next.next.next.val).isEqualTo(5);
  }
}