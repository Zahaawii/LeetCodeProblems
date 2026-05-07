package leetcodeEasyJava;

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

    public static int removeDuplicates(int[] nums) {

        /*
        For this problem set we have to remove the duplicates and display the array in the correct order.
        In order to do so, we have to initialize an index variable starting at one.
        The idea of this is to start the loop from one, and check if there is duplicates, if there isn't then replace the current value in the array.
        If there is, then skip that iteration until it finds a number that doesn't align.
        The only reason this works is because we know that every duplicates is combined together
        otherwise this wouldnt work.

        To display how the code works:
        If we have 1, 1, 2 the code does the following:
        index = 1, nums[1] = 1. nums[0 (i - 1)] = 1
        Is the following number the same: nums[1] = 1 as nums[0 (i - 1)] = 1? Yes it is, okay then dont do anything.
        So the array looks like [1, 1, 2]
        index = 1, nums[2] = 2, nums[1] = 1.
        Is the following number the same: nums[2] = 2 as nums[1] = 1? No it is not, okay then add the number add to nums[1 (index=1)] = nums[2]
        Now the array looks like [1, 2, 2] and index becomes 2
        index = 2, nums[3] = 2, nums[2] = 2.
        Is the following number the same: nums[3] = 2 as nums[2 (i - 1)] = 2? Yes it is, okay then dont do anything.
        Now the array looks like [1, 2, 2] Because we have copied the two from the next index
         */
        int index = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;

    }
}
