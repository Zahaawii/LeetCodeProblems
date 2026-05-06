package leetcodeEasy;

import java.util.HashMap;

/*
Two sum problem:
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Two sum solution:
 */
public class Easy {
        public int[] twoSum(int[] nums, int target) {

            HashMap<Integer, Integer> numsMap = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int temp = target - nums[i];
                if (numsMap.containsKey(temp)) {
                    return new int[]{numsMap.get(temp), i};
                }
                numsMap.put(nums[i], i);
            }
            return new int[]{};
       /*
       for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            return new int[]{};
        }
        */
        }
}
