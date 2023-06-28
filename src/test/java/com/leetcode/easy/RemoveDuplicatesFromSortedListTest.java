package com.leetcode.easy;

import com.leetcode.TestUtils.ListNodeCreator;
import com.leetcode.Utils.ListNode;
import com.leetcode.easy.RemoveDuplicatesFromSortedList;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class RemoveDuplicatesFromSortedListTest {

  private final RemoveDuplicatesFromSortedList classUnderTest = new RemoveDuplicatesFromSortedList();

  @Test
  public void test1() {
    ListNode input = ListNodeCreator.createListNodes(0,1,2);
    ListNode result = classUnderTest.deleteDuplicates(input);
    assertThat(result).isEqualTo(input);
  }

  @Test
  public void test2() {
    ListNode input = ListNodeCreator.createListNodes(1,1,2);
    ListNode result = classUnderTest.deleteDuplicates(input);
    assertThat(result.val).isEqualTo(1);
    assertThat(result.next.val).isEqualTo(2);
    assertThat(result.next.next).isNull();
  }

  @Test
  public void test3() {
    ListNode input = ListNodeCreator.createListNodes(1,1,2,2);
    ListNode result = classUnderTest.deleteDuplicates(input);
    assertThat(result.val).isEqualTo(1);
    assertThat(result.next.val).isEqualTo(2);
    assertThat(result.next.next).isNull();
  }

  @Test
  public void test4() {
    ListNode input = ListNodeCreator.createListNodes(1,1,1,2,2,2);
    ListNode result = classUnderTest.deleteDuplicates(input);
    assertThat(result.val).isEqualTo(1);
    assertThat(result.next.val).isEqualTo(2);
    assertThat(result.next.next).isNull();
  }
  @Test
  public void test5() {
    ListNode input = ListNodeCreator.createListNodes(1,1,1,2,2,2,5,5,6);
    ListNode result = classUnderTest.deleteDuplicates(input);
    assertThat(result.val).isEqualTo(1);
    assertThat(result.next.val).isEqualTo(2);
    assertThat(result.next.next.val).isEqualTo(5);
    assertThat(result.next.next.next.val).isEqualTo(6);
    assertThat(result.next.next.next.next).isNull();
  }
}