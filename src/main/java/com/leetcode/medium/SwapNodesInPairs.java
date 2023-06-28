package com.leetcode.medium;

import com.leetcode.Utils.ListNode;

public class SwapNodesInPairs {

  public ListNode swapPairs(ListNode head) {
    swapPairsHelper(head);
    return head;
  }

  public void swapPairsHelper(ListNode head) {
    if (head == null || head.next == null) {
      return;
    }
    ListNode nextNode = head.next;
    // swap values
    int temp = head.val;
    head.val = nextNode.val;
    nextNode.val = temp;
    swapPairs(nextNode.next);
  }
}
