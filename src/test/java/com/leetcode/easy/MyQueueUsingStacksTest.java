package com.leetcode.easy;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class MyQueueUsingStacksTest {

  private MyQueueUsingStacks myQueueUsingStacks;

  @Before
  public void setUp() {
    myQueueUsingStacks = new MyQueueUsingStacks();
  }

  @Test
  public void testPushAndPeek() {
    myQueueUsingStacks.push(1);
    assertThat(myQueueUsingStacks.peek()).isEqualTo(1);
    assertThat(myQueueUsingStacks.empty()).isFalse();
  }

  @Test
  public void testPushAndPop() {
    myQueueUsingStacks.push(1);
    assertThat(myQueueUsingStacks.pop()).isEqualTo(1);
    assertThat(myQueueUsingStacks.empty()).isTrue();
  }

  @Test
  public void testPushPushPok() {
    myQueueUsingStacks.push(1);
    myQueueUsingStacks.push(2);
    assertThat(myQueueUsingStacks.pop()).isEqualTo(1);
    assertThat(myQueueUsingStacks.empty()).isFalse();
    assertThat(myQueueUsingStacks.peek()).isEqualTo(2);
    assertThat(myQueueUsingStacks.pop()).isEqualTo(2);
    assertThat(myQueueUsingStacks.empty()).isTrue();
  }

  @Test
  public void testComplexFlow() {
    myQueueUsingStacks.push(1);
    myQueueUsingStacks.push(2);
    myQueueUsingStacks.push(3);
    myQueueUsingStacks.push(4);
    assertThat(myQueueUsingStacks.pop()).isEqualTo(1);
    myQueueUsingStacks.push(5);
    assertThat(myQueueUsingStacks.pop()).isEqualTo(2);
    assertThat(myQueueUsingStacks.pop()).isEqualTo(3);
    assertThat(myQueueUsingStacks.pop()).isEqualTo(4);
    assertThat(myQueueUsingStacks.pop()).isEqualTo(5);
    assertThat(myQueueUsingStacks.empty()).isTrue();
  }
}