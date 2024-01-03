package com.leetcode.medium;

public class NumberOfLaserBeamsInBank {
  public int numberOfBeams(String[] bank) {
    int sum = 0;
    int numberOfSecurityDevicesInPreviousRow = 0;

    for (String row : bank) {
      // no need to count on the row which does not have security device
      if (row.contains("1")) {
        // count number of security devices exists on the current row
        int numberOfSecurityDevicesInCurrentRow = (int) row.chars().filter(ch -> ch == '1').count();
        // number of beans received from the previous row to the current row
        sum += (numberOfSecurityDevicesInPreviousRow * numberOfSecurityDevicesInCurrentRow);
        numberOfSecurityDevicesInPreviousRow = numberOfSecurityDevicesInCurrentRow;
      }
    }
    return sum;
  }
}
