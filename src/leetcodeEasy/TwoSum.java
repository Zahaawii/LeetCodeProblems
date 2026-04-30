package leetcodeEasy;

import java.util.HashMap;

// Two sum solution:
/*

Brute force method that iterates over every possible solution. The first loop takes the first number and the second nested loop
checks all the other numbers to see if it matches the target. if not, reiterate from top to buttom.

I tried with HashMap and minus the number from the target to see if it worked out, but as I did not have the core knowledge of how to
maintain hashmaps I wasnt able too get the answer.
However, I saw a result from someone where the answer reminded me of how I would answer it:

        HashMap <Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if(numsMap.containsKey(temp)) {
                return new int[]{numsMap.get(temp), i};
            }
            numsMap.put(nums[i], i);
        }
        return new int[]{};

 I cannot take the credit for it, but I was trying to solve it like this, but the answer has a runtime on 2 ms
 I will strive to become on this level hahas

 */
public class TwoSum {
        public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            return new int[]{};
        }
}
