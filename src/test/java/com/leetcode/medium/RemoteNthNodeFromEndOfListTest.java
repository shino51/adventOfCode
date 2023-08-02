package com.leetcode.medium;

import com.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RemoteNthNodeFromEndOfListTest {

  private final RemoteNthNodeFromEndOfList remoteNthNodeFromEndOfList = new RemoteNthNodeFromEndOfList();

  @Test
  void onlyOneInput() {
    ListNode head = new ListNode(1);
    int index = 1;
    ListNode result = remoteNthNodeFromEndOfList.removeNthFromEnd(head, index);
    assertThat(result).isNull();
  }

  @Test
  void twoInput() {
    ListNode head = new ListNode(1, new ListNode(2));
    int index = 1;
    ListNode result = remoteNthNodeFromEndOfList.removeNthFromEnd(head, index);
    assertThat(result).isNotNull();
    assertThat(result.val).isEqualTo(1);
    assertThat(result.next).isNull();
  }

  @Test
  void multipleInput() {
    ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
    int index = 2;
    ListNode result = remoteNthNodeFromEndOfList.removeNthFromEnd(head, index);
    assertThat(result).isNotNull();
    assertThat(result.val).isEqualTo(1);
    assertThat(result.next.val).isEqualTo(2);
    assertThat(result.next.next.val).isEqualTo(3);
    assertThat(result.next.next.next.val).isEqualTo(5);
    assertThat(result.next.next.next.next).isNull();
  }
}