package LeetCode;

import java.math.BigInteger;

public class AddBinary {
  public String addBinary(String a, String b) {
    BigInteger aInt = new BigInteger(a, 2);
    BigInteger bInt = new BigInteger(b, 2);
    BigInteger sum = aInt.add(bInt);

    return sum.toString(2);
  }
}
