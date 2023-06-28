package com.leetcode.easy;

import com.leetcode.Utils.ListNode;

public class ReverseLinkedList {

  public ListNode reverseList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode currentNode = head.next;
    head.next = null;
    return reverse(currentNode, head);
  }

  private ListNode reverse(ListNode currentNode, ListNode previousNode) {
    if (currentNode == null) {
      // previous is the last node
      return previousNode;
    }
    ListNode nextCurrentNode = currentNode.next;
    currentNode.next = previousNode;
    return reverse(nextCurrentNode, currentNode);
  }
}
