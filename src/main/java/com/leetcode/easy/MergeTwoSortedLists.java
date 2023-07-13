package com.leetcode.easy;

import com.leetcode.utils.ListNode;

public class MergeTwoSortedLists {
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if (list1 == null && list2 == null) {
      return null;
    }
    ListNode input = new ListNode(0);
    ListNode next = input;
    ListNode input1Next = list1;
    ListNode input2Next = list2;
    while (input1Next != null || input2Next != null) {
      if (input1Next == null || ((input2Next != null) && (input1Next.val > input2Next.val))) {
        next.val = input2Next.val;
        input2Next = input2Next.next;
      } else {
        next.val = input1Next.val;
        input1Next = input1Next.next;
      }
      if (input1Next != null || input2Next != null) {
        next.next = new ListNode();
        next = next.next;
      }
    }
    return input;
  }
}
