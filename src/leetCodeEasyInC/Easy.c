// 0 ms with C basically same as the java code

int removeDuplicates(int* nums, int numsSize) {
        int index = 1;
            for (int i = 1; i < numsSize; i++) {
                    if(nums[i] != nums[i-1]) {
                        nums[index] = nums[i];
                        index++;
                    }
                }
            return index;
}


int lengthOfLastWord(char* s) {

}