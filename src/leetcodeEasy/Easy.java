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

            // Initialize variables to sort the problem
            HashMap<Integer, Integer> countedNums = new HashMap<>();
            int length = nums.length;
            int count = 0;
            // Iterate throughout the whole array and add it in a hashmap to be able to find duplicates
            for (int num : nums) {
            countedNums.put(num, 0);
            }

            // Iterate throughout the whole array to find duplicated values by increasing the value <- maybe two for loops is overkill?
            for (int num : nums) {
                if (countedNums.containsKey(num)) {
                    countedNums.put(num, countedNums.get(num) + 1);
                }
            }

            /*
            Now the real issue is here. I am not quite sure. I can create the array with only the non duplicated values but the
            duplicated values becomes 0 as the if statement is not correct which is working as intended, just need to figure out how to change that.
            Furthermore, I need to only add the duplicated value once so 1,1,2 becomes 1,2
             */

            int [] newNums = new int[length];
            for (int i = 0; i < length; i++) {
                if(countedNums.get(nums[i]) == 1) {
                    newNums[i] = nums[i];
                }
            }
            return newNums;
    }
}
