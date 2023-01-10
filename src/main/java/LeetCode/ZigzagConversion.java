package LeetCode;

public class ZigzagConversion {
  public String convert(String s, int numRows) {
    if (numRows == 1) {
      return s;
    }
    StringBuilder[] matrix = new StringBuilder[numRows];
    int rowIndex = 0;
    boolean isGoingDown = true;
    for (char ch : s.toCharArray()) {
      if (matrix[rowIndex] == null) {
        matrix[rowIndex] = new StringBuilder();
      }
      matrix[rowIndex].append(ch);

      if ((isGoingDown && rowIndex == numRows - 1) || (!isGoingDown && rowIndex == 0)) {
        isGoingDown = !isGoingDown;
      }

      if (isGoingDown) {
        rowIndex++;
      } else {
        rowIndex--;
      }
    }

    StringBuilder result = new StringBuilder();
    for (StringBuilder resultRow : matrix) {
      if (resultRow != null) {
        result.append(resultRow);
      }
    }
    return result.toString();
  }
}
