import leetcodeEasy.Easy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] nums = new int []{1, 1, 2};
        int k = Easy.removeDuplicates(nums);
        int[] expectedNums = {1,2};

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
        System.out.println(Arrays.toString(nums));
    }
    }
