package com.leetcode.easy;

import com.leetcode.utils.ListNode;

import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoLinkedLists {

  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    if (headA == null || headB == null) {
      return null;
    }

    Map<ListNode, ListNode> headBMap = assignAllNodeFromHead(headB);
    return findIntercept(headA, headBMap);
  }

  private Map<ListNode, ListNode> assignAllNodeFromHead(ListNode head) {
    ListNode nextNode = head;
    Map<ListNode, ListNode> map = new HashMap<>();

    do {
      map.put(nextNode, nextNode);
      nextNode = nextNode.next;
    }
    while (nextNode != null);
    return map;
  }

  private ListNode findIntercept(ListNode currentANode, Map<ListNode, ListNode> headBMap) {
    if (currentANode == null) {
      return null;
    }
    ListNode intercept = headBMap.get(currentANode);
    return intercept == null ? findIntercept(currentANode.next, headBMap) : intercept;
  }
}
