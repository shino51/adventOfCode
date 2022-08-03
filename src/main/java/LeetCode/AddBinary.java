package LeetCode;

public class AddBinary {
  public String addBinary(String a, String b) {
    int aLength = a.length();
    int bLength = b.length();

    int carryOver = 0;
    StringBuilder resultString = new StringBuilder();

    for (int i = 1; i <= Math.max(aLength, bLength); i++) {
      int aValue = aLength < i ? 0 : Character.getNumericValue(a.charAt(aLength - i));
      int bValue = bLength < i ? 0 : Character.getNumericValue(b.charAt(bLength - i));

      int valueOnArray = aValue + bValue + carryOver;

      if (valueOnArray >= 2) {
        carryOver = (int) Math.ceil(valueOnArray / 2.0);
        valueOnArray %= 2;
      } else {
        carryOver = 0;
      }
      resultString.insert(0, valueOnArray);
    }

    while (carryOver > 0) {
      if (carryOver % 2 == 1) {
        resultString.insert(0, "1");
        carryOver -= 1;
      } else {
        resultString.insert(0, "0");
        carryOver -= 2;
      }
    }
    return resultString.toString();
  }
}
