package com.leetcode.easy;

import com.leetcode.utils.ListNode;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;


public class MergeTwoSortedListsTest {
  private final MergeTwoSortedLists classUnderTest = new MergeTwoSortedLists();

  @Test
  public void test1() {
    ListNode input1 = new ListNode(1, new ListNode(2, new ListNode(4)));
    ListNode input2 = new ListNode(1, new ListNode(3, new ListNode(4)));
    ListNode output = classUnderTest.mergeTwoLists(input1, input2);
    assertThat(output.val).isEqualTo(1);
    assertThat(output.next.val).isEqualTo(1);
    assertThat(output.next.next.val).isEqualTo(2);
    assertThat(output.next.next.next.val).isEqualTo(3);
    assertThat(output.next.next.next.next.val).isEqualTo(4);
    assertThat(output.next.next.next.next.next.val).isEqualTo(4);
    assertThat(output.next.next.next.next.next.next).isNull();
  }

  @Test
  public void test2() {
    ListNode input1 = null;
    ListNode input2 = null;
    ListNode output = classUnderTest.mergeTwoLists(input1, input2);
    assertThat(output).isNull();
  }

  @Test
  public void test3() {
    ListNode input1 = null;
    ListNode input2 = new ListNode(0);
    ListNode output = classUnderTest.mergeTwoLists(input1, input2);
    assertThat(output.val).isZero();
    assertThat(output.next).isNull();
  }

  @Test
  public void test4() {
    ListNode input1 = new ListNode(2);
    ListNode input2 = null;
    ListNode output = classUnderTest.mergeTwoLists(input1, input2);
    assertThat(output.val).isEqualTo(2);
    assertThat(output.next).isNull();
  }
}