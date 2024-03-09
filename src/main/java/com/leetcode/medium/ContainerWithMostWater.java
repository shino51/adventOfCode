package com.leetcode.medium;

public class ContainerWithMostWater {

  public int maxArea(int[] height) {
    int maxArea = 0;
    int highestLeftHeight = 0;

    for (int i = 0; i < height.length; i++) {
      if (highestLeftHeight >= height[i]) {
        continue;
      }
      highestLeftHeight = height[i];
      for (int j = i; j < height.length; j++) {
        int area =  (Math.min(highestLeftHeight, height[j])  * (j-i));
        if (area > maxArea) {
          maxArea = area;
        }
      }
    }
    return maxArea;
  }
}
