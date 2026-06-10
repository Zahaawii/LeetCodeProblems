package leetcodeEasyJava;

import java.util.*;

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
     /*
        Problem set: Given an integer x, return true if x is a palindrome, and false otherwise.
        Solution: The solution for this is to take the number
        change it to string, change the number order from start to end
        Check if the converted text is equal to the flipped test
        Need to revise it or do it in C
    */
    public  boolean isPalindrome(int x) {
        String convertX = String.valueOf(x);
        int length = convertX.length();
        String flipTest = "";
        for(int i = length; i > 0; i--) {
            flipTest += convertX.charAt(i - 1);
        }
        if(flipTest.equals(convertX)) {
            return true;
        }
        return false;

    }


    public static String longestCommonPrefix(String[] strs) {
        // Currently wokring on this one - not done.
        // TODO: Fix the code to check for 0 strings etc
        if(strs.length == 1) {
            return strs[0];
        }

        String newStr = "";
        for(int i = 1; i < strs.length; i++) {
            if(!strs[0].isEmpty() && strs[0].substring(0, i).equals(strs[i].substring(0, i))) {
                newStr = strs[0].substring(0, i);
            }
        }
        return newStr;
    }
    /*
        Problem set: Given a string s consisting of words and spaces, return the length of the last word in the string.
        Solution: Strip the string from whitespaces so if there is spaces in the beginning or end, it gets removed
        Split the words into array if there is a space in between
        Take the length of the array and index into the last and return the length of that word

        TODO: Do it in C

        Another solution without strip
        String newStr = s.strip();
        int length = newStr.length();
        int spacesCount = 0;

        for (int i = 0; i < length; i++) {
            if (newStr.charAt(i) == ' ') {
                spacesCount = i + 1;
            }
           }
        return newStr.substring(spacesCount).length();
     */

    public static int lengthOfLastWord(String s) {
        String newStr = s.strip();
        String [] test = newStr.split(" ");
        int lenght = test.length;
        return test[lenght - 1].length();
    }

    public static boolean isPalindrome(String s) {
        /*
         * Very bad code with the regex, need to fix it to only take the alphabetic value or maybe overall change the code
         * the code runs on 160ms which is baaaad
         */
        String regex = "[ !\"#$%&'()*+,\\-./:;<=>?@\\[\\\\\\]^_`{|}~]";
        String [] test = s.split(regex);
        String newStr = "";
        for (String str : test) {
            newStr += str.toLowerCase();
        }

        int length = newStr.length();
        String flipTest = "";
        for(int i = length; i > 0; i--) {
            flipTest += newStr.charAt(i - 1);
        }

        if(flipTest.equals(newStr)) return true;

        return false;
    }

    /*
            Problem set:
            Given two strings needle and haystack,
            return the index of the first occurrence of needle in haystack,
            or -1 if needle is not part of haystack.


            Notes: Apparently this work, but i dont know if it is seen as "correct" code.
            However, it beats 100% and has a 0ms, so something might as well be very good
            Though I had another solution:

               for(int i = 0, j = needle.length(); j<=haystack.length(); i++,j++){
                    if(haystack.substring(i,j).equals(needle)){
                        return i;
                    }
                }
                return -1;

                Solution:
                Return the indexOf where haystack and needle meets
     */

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    // TODO: Still working on this, right now it passes test but not the submit
    // Issue is that if s is smaller than t or vice versa :(
    public static boolean isAnagram(String s, String t) {
        int length = s.length();
        boolean test = false;

        for(int i = 0; i < length; i++) {
            System.out.println(i + ": " + s.charAt(i));
            test = s.charAt(i) == t.charAt(i);
        }
        return test;
    }

    /*
        Problem set: Write a function that reverses a string. The input string is given as an array of characters s.
                     You must do this by modifying the input array in-place with O(1) extra memory.

        Solution:
        We instantiate two variables: one that starts from the beginning and one from the end
        Then we make a continuous loop until the conditional is no longer true.

        We have to create a temp variable that stores the value of the first character (then the second..., until we hit the same number as right side)
        Since we now has stored the temporary value, we can take the right side and place it in the beginning.
        Afterwards we take temp value and place it in the end.
        Lastly we increment the left side and decrement the right side for it to hit the same number
        Then we stop.


     */
    public void reverseString(char[] s) {

        int leftSide = 0;
        int rightSide = s.length - 1;

        while(leftSide < rightSide) {
            char temp = s[leftSide];
            s[leftSide] = s[rightSide];
            s[rightSide] = temp;
            leftSide++;
            rightSide--;
        }


        /*

        Sooo apparently I need to fix the array without creating a new one, ups.
        trying again
        char [] newS = new char [s.length];

        int test = 0;
        for(int i = s.length; i > 0; i--) {
            newS[test] = s[i + 1];
            test++;
        }
        System.arraycopy(newS, 0, s, 0, s.length);

          Actually used this:
        for(int i = 0; i < s.length; i++) {
            s[i] = newS[i];
        }
        But System.arrayCopy is faster and gives me 0ms
         */
    }

    public static String reverseWords(String s) {
        String newStr = "";
        String [] test = s.split(" ");
        System.out.println(Arrays.toString(test));
        int length = test.length;
        for (int i = 0; i < length; i++) {
            for(int j = length; j > 0; j--) {
                newStr += test[i].charAt(j);
            }
        }

        return newStr;
    }

    /*
        Problem set:
        You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have.
        Each character in stones is a type of stone you have.
        You want to know how many of the stones you have are also jewels.

        Solution:
        I solved the problem by iterating in a nested for loop in order to take each character of the jewels and compare with
        every character of the stones.
        So for each character in jewels we iterate through all characters of stones to see which is a match.

     */
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int i = 0, length = jewels.length(), stoneLength = stones.length(); i < length; i++) {
            for (int j = 0; j < stoneLength; j++) {
                if (jewels.charAt(i) == stones.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    /*
        Problem set:
        Given a valid (IPv4) IP address, return a defanged version of that IP address.
        A defanged IP address replaces every period "." with "[.]".

        Solution:
        Use the built-in replace all function to replace all the '.' to [.]

        To be honest, I dont really like this idea since it uses a built in,
        so maybe I will do it in C or another way in Java to modify it manually
     */
    public static String defangIPaddr(String address) {
        // return address.replace(".", "[.]");
        // return address.replaceAll("\\.", "[.]");
       /*
       This one is 0 ms
        StringBuilder newStr = new StringBuilder();
         for (int i = 0; i < address.length(); i++) {
            if(address.charAt(i) == '.') {
                newStr.append("[.]");
            } else {
                newStr.append(address.charAt(i));

            }
        }
        return newStr.toString();
        */

        // this one is 3 ms but does not use built-in functions
        String newStr = "";
        for (int i = 0; i < address.length(); i++) {
            if(address.charAt(i) == '.') {
                newStr += "[.]";
            } else {
                newStr += (address.charAt(i));

            }
        }
        return newStr;

    }

    /*

       Problem set: Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
       That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

       With built-in functions:
       Map<Integer, Integer> newMap = new HashMap<>();
        int l = nums.length;
        int [] newNums = nums.clone();

        Arrays.sort(newNums);
        for(int i = 0; i < l; i++) {
            newMap.putIfAbsent(newNums[i], i);
        }

        for(int i = 0; i < l; i++) {
            newNums[i] = newMap.get(nums[i]);
        }
        return newNums;

        Code below is without built-in functions
     */

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer, Integer> newMap = new HashMap<>();
        int l = nums.length;
        int [] newNums = new int[l];


        for(int i = 0; i < l; i++) {
            newNums[i] = nums[i];
        }

        for(int i = 0; i < l; i++) {
            int temp = 0;
            for(int j = i + 1; j < l; j++) {
                if(newNums[i] > newNums[j]) {
                    temp = newNums[i];
                    newNums[i] = newNums[j];
                    newNums[j] = temp;
                }
            }
        }

        for(int i = 0; i < l; i++) {
            newMap.putIfAbsent(newNums[i], i);
        }

        for(int i = 0; i < l; i++) {
            newNums[i] = newMap.get(nums[i]);
        }
        return newNums;
    }

    /*
    Problem set: Given an integer array nums, return true if any value appears at least twice in the array,
    and return false if every element is distinct.
     */
    public static boolean containsDuplicate(int[] nums) {
        // Create a hashmap to count how many times the number appears
        Map<Integer, Integer> numCount = new HashMap<>();

        // We have to add the nums into the Hashmap
        for(int i : nums) {
            numCount.put(i, 0);
        }

        // Check the map, if the number in the key is same as the array index, if yes count 1
        for (int num : nums) {
            if (numCount.containsKey(num)) {
                numCount.put(num, numCount.get(num) + 1);
            }
        }

        // Now we check whether the value in the hashmap has more than one, if yes return true else return false
        // We only have to check if one of them are true then we can stop
        for (int num : nums) {
            if (numCount.get(num) > 1) {
                return true;
            }
        }
        return false;

    }

    }
