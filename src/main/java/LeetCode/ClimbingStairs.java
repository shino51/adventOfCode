package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {

  /**
   * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top
   */

  private final Map<Integer, Integer> steps = new HashMap<>(Map.of(0, 0, 1, 1, 2, 2, 3, 3));

  public int climbStairs(int n) {
    if (!steps.containsKey(n)) {
      steps.put(n, climbStairs(n - 1) + climbStairs(n - 2));
    }
    return steps.get(n);
  }
}
