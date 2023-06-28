package com.leetcode.easy;

import com.leetcode.Utils.ListNode;
import com.leetcode.easy.ReverseLinkedList;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ReverseLinkedListTest {

  private final ReverseLinkedList classUnderTest = new ReverseLinkedList();

  @Test
  public void whenNull() {
    ListNode head = null;
    ListNode result = classUnderTest.reverseList(head);
    assertThat(result).isNull();
  }

  @Test
  public void whenOnlyOneInput() {
    ListNode head = new ListNode(1);
    ListNode result = classUnderTest.reverseList(head);
    assertThat(result).isEqualTo(head);
  }

  @Test
  public void whenTwoNodes() {
    ListNode head = new ListNode(1, new ListNode(2));
    ListNode result = classUnderTest.reverseList(head);
    assertThat(result.val).isEqualTo(2);
    assertThat(result.next.val).isEqualTo(1);
  }

  @Test
  public void whenFiveNodes() {
    ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
    ListNode result = classUnderTest.reverseList(head);
    assertThat(result.val).isEqualTo(5);
    assertThat(result.next.val).isEqualTo(4);
    assertThat(result.next.next.val).isEqualTo(3);
    assertThat(result.next.next.next.val).isEqualTo(2);
    assertThat(result.next.next.next.next.val).isEqualTo(1);
    assertThat(result.next.next.next.next.next).isNull();
  }
}