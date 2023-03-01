package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalsTriangle2 {
  public List<Integer> getRow(int rowIndex) {
    List<Integer> previousRow = null;
    List<Integer> row = null;

    for (int r = 0; r < rowIndex + 1; r++) {
      row = new ArrayList<>();

      for (int c = 0; c <= r; c++) {
        if (c == 0 || c == r) {
          row.add(1);
        } else {
          int value = previousRow.get(c - 1) + previousRow.get(c);
          row.add(value);
        }
      }
      previousRow = row;
    }
    return row;
  }
}
