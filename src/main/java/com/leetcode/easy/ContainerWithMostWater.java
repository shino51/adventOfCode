package com.leetcode.easy;

public class ContainerWithMostWater {

  public int maxArea(int[] height) {
    int maxArea = 0;
    int highestRightPosition = 0;
    for (int left = 0; left < height.length - 1; left++) {
      int startingPositionFoLeft = Math.max(left + 1, highestRightPosition);
      for (int right = startingPositionFoLeft; right < height.length; right++) {
        int bottomLength = right - left;
        int currentArea = bottomLength * Math.min(height[left], height[right]);
        if (maxArea < currentArea) {
          highestRightPosition = right;
        }
        maxArea = Math.max(maxArea, currentArea);
      }
    }
    return maxArea;
  }

//  public int getHighestHight(int[] height) {
//    int highest = 0;
//    for (int i = 0; i < height.length; i++) {
//
//    }
//  }
}
