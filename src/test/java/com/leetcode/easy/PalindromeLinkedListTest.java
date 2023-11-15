package com.leetcode.easy;

import com.leetcode.utils.ListNode;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class PalindromeLinkedListTest {

  private final PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();

  @Test
  public void testWithOneInput() {
    ListNode head = new ListNode(1);
    assertThat(palindromeLinkedList.isPalindrome(head)).isTrue();
  }

  @Test
  public void testWithThreeInput() {
    ListNode head = new ListNode(1, new ListNode(2, new ListNode(1)));
    assertThat(palindromeLinkedList.isPalindrome(head)).isTrue();
  }

  @Test
  public void testWithFourInput() {
    ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
    assertThat(palindromeLinkedList.isPalindrome(head)).isTrue();
  }
}