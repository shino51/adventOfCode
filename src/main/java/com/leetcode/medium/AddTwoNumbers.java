package com.leetcode.medium;

import com.leetcode.Utils.ListNode;

import java.math.BigInteger;

public class AddTwoNumbers {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    BigInteger totalSum = calculateInteger(l1).add(calculateInteger(l2));
    String sumString = totalSum.toString();
    ListNode first = new ListNode();
    ListNode second = new ListNode();
    for (int i = 0; i < sumString.length(); i++) {
      first.val = Character.getNumericValue(sumString.charAt(i));
      if(i != 0) {
        first.next = second;
      }
      second = first;
      first = new ListNode();
    }
    return second;
  }

  private BigInteger calculateInteger(ListNode node) {
    BigInteger number = BigInteger.valueOf(node.val);
    ListNode nextNode = node;
    BigInteger place = BigInteger.TEN;
    while(nextNode.next != null) {
      nextNode = nextNode.next;
      number = number.add((BigInteger.valueOf(nextNode.val).multiply(place)));
      place = place.multiply(BigInteger.TEN);
    }
    return number;
  }
}
