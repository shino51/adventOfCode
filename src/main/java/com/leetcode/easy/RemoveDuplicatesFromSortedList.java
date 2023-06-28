package com.leetcode.easy;

import com.leetcode.Utils.ListNode;

public class RemoveDuplicatesFromSortedList {

  public ListNode deleteDuplicates(ListNode head) {
    ListNode currentNode = head;
    while (currentNode != null && currentNode.next != null) {
      if (currentNode.val == currentNode.next.val) {
        currentNode.next = currentNode.next.next;
      } else {
        currentNode = currentNode.next;
      }
    }
    return head;
  }
}
