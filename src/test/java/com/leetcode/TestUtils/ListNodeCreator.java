package com.leetcode.TestUtils;

import com.leetcode.utils.ListNode;

public class ListNodeCreator {

  public static ListNode createListNodes(int... values) {
    ListNode next = new ListNode();
    ListNode head = new ListNode(values[0], next);
    for(int i = 1; i < values.length; i++) {
      next.val = values[i];
      if (i != values.length - 1) {
        ListNode nextOnNext = new ListNode();
        next.next = nextOnNext;
        next = nextOnNext;
      }
    }
    return head;
  }
}
