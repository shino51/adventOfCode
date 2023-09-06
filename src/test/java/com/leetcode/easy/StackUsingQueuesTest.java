package com.leetcode.easy;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class StackUsingQueuesTest {

  private StackUsingQueues stackUsingQueues;

  @Before
  public void setUp() throws Exception {
    stackUsingQueues = new StackUsingQueues();
  }

  @Test
  public void testPushAndTop() {
    int entry = 1;
    stackUsingQueues.push(entry);
    int toppedEntry = stackUsingQueues.top();
    assertThat(toppedEntry).isEqualTo(entry);
    assertThat(stackUsingQueues.empty()).isFalse();
  }

  @Test
  public void testPushAndPop() {
    int entry = 1;
    stackUsingQueues.push(entry);
    int toppedEntry = stackUsingQueues.pop();
    assertThat(toppedEntry).isEqualTo(entry);
    assertThat(stackUsingQueues.empty()).isTrue();
  }


  @Test
  public void testPushAndPopMultipleTimes() {
    stackUsingQueues.push(1);
    stackUsingQueues.push(2);
    assertThat(stackUsingQueues.pop()).isEqualTo(2);
    assertThat(stackUsingQueues.empty()).isFalse();
    assertThat(stackUsingQueues.pop()).isEqualTo(1);
    assertThat(stackUsingQueues.empty()).isTrue();
  }
}