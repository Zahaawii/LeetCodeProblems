package Java.easy.array101;


import java.util.Arrays;

/**
 * Arrays 101
 * <a href="https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/">...</a>
 */
public class arrays {


    /*

    Problem set 1295: Finding numbers with even number of digits
    Given an array nums of integers, return how many of them contain an even number of digits.

    Input: nums = [12,345,2,6,7896]
    Output: 2

    Thought process:
    My initial thought was to see if the number is even or odd, but reading the description again, I realized I was wrong.
    The way to solve the question is to get the size of the numbers characters and see if its odd or not.
    How to do so should be to either get the size of the number, just like .size in an array but I dont think it works for numbers.
    The next thing is that we need to count each number add it up and see if its odd or not.

    We need a counter and a loop for now. I need to see if the methods to solve is possible or i have to create it

    Solution:
    The solution was solved by converting the number sequence to a string. By doing so, it is possible to count the characters.
    By coverting the string we then can count each character and add it to a countChar.
    While having the counted number of characters we can use a mod to see if the whole sequence is odd or not.
    If so, we increment the counter by 1. The loop continues, refreshing the variables and return the count.

    I can see by the solutions that this may not be the best idea due to Big O notation, but this is how I could solve it.

     */
    public static int findNumbers(int[] nums) {
        int count = 0;
        int l = nums.length;

        for (int i = 0; i < l; i++) {
            int countChar = 0;
            String test = String.valueOf(nums[i]);
            int length = test.length();
            for(int j = 0; j < length; j++) {
                countChar++;
            }
            if(countChar % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    /*

        Problem: Squares of a sorted Array
        Given an integer array nums sorted in non-decreasing order,
        return an array of the squares of each number sorted in non-decreasing order.

        Thought process:
        We have a sequence of numbers that needs to be multiplied with the same number.
        Afterwards, we need to sort it from lowest to highest (ascending)
        To be able to do it, we need to instantiate a new array of the same length, take the old array,
        square the sequence, sort it and then take the old array and add it to the new one.
        We can either use a build in sort or use our own. I think I will try with both to see.



     */

    public static int[] sortedSquares(int [] nums) {
        int length = nums.length;

        for (int i = 0; i < length; i++) {
           nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);
        return nums;
    }
}
