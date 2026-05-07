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

    public static int[] removeDuplicates(int[] nums) {

            // I had to check the hints and can see i've been a bit wrong about how to solve this
            // SO now im trying my idea with using a nested for loop - still doesnt work yet
            int length = nums.length;

            int [] newNums = new int[length];
            for (int i = 0; i < length; i++) {
                for(int j = i + 1; j < length; j++) {
                    newNums[i] = nums[i];
                    if (nums[i] != nums[j]) {
                        newNums[i] = nums[j];
                    }
                }
            }
            return newNums;
    }
}
