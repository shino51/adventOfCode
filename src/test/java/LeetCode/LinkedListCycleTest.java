package LeetCode;

import LeetCode.Utils.ListNode;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * Note: when you run this from the debug mode, you will get stackOverflow exception. Please update ListNode class for the debugger to execute
 */
public class LinkedListCycleTest {

  private final LinkedListCycle classUnderTest = new LinkedListCycle();

  @Test
  public void testHasLoopWithSingleNodes() {
    ListNode root = new ListNode(1);
    ListNode next = new ListNode(2, root);
    root.next = next;
    assertThat(classUnderTest.hasCycle(root)).isTrue();
  }

  @Test
  public void testHasLoopWith4Nodes() {
    ListNode root = new ListNode(3);
    ListNode secondNode = new ListNode(2);
    ListNode thirdNode = new ListNode(0);
    ListNode lastNode = new ListNode(-4, secondNode);
    root.next = secondNode;
    secondNode.next = thirdNode;
    thirdNode.next = lastNode;

    assertThat(classUnderTest.hasCycle(root)).isTrue();
  }

  @Test
  public void testDoesNotHaveLoop() {
    ListNode root = new ListNode(1, new ListNode(2));
    assertThat(classUnderTest.hasCycle(root)).isFalse();
  }
}