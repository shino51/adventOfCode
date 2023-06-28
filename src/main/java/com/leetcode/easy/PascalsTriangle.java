package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> previousRow = null;

    for (int rowIndex = 0; rowIndex < numRows; rowIndex++) {
      List<Integer> row = new ArrayList<>();

      for (int columnIndex = 0; columnIndex <= rowIndex; columnIndex++) {
        if (columnIndex == 0 || columnIndex == rowIndex) {
          row.add(1);
        } else {
          int value = previousRow.get(columnIndex - 1) + previousRow.get(columnIndex);
          row.add(value);
        }
      }
      previousRow = row;
      result.add(row);
    }
    return result;
  }
}
