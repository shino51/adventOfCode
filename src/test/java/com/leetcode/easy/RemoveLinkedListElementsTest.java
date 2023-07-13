package com.leetcode.easy;

import com.leetcode.utils.ListNode;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class RemoveLinkedListElementsTest {

  private final RemoveLinkedListElements classUnderTest = new RemoveLinkedListElements();

  @Test
  public void whenInputIsNull() {
    ListNode head = null;
    int val = 1;
    ListNode result = classUnderTest.removeElements(head, val);
    assertThat(result).isNull();
  }

  @Test
  public void whenAllInputIsApplied() {
    ListNode head = new ListNode(1, new ListNode(1));
    int val = 1;
    ListNode result = classUnderTest.removeElements(head, val);
    assertThat(result).isNull();
  }

  @Test
  public void whenSomeInputsAreApplied() {
    ListNode head = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));
    int val = 6;
    ListNode result = classUnderTest.removeElements(head, val);
    assertThat(result.val).isEqualTo(1);
    assertThat(result.next.val).isEqualTo(2);
    assertThat(result.next.next.val).isEqualTo(3);
    assertThat(result.next.next.next.val).isEqualTo(4);
    assertThat(result.next.next.next.next.val).isEqualTo(5);
    assertThat(result.next.next.next.next.next).isNull();
  }
}