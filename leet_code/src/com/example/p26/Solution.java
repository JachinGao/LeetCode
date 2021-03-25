package com.example.p26;

public class Solution {
    public static void main(String[] args) {

    }

    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        int idx = 0;

        for (int i = 0; i < length; i++) {
            if (nums[idx] != nums[i]) {
                idx += 1;
                nums[idx] = nums[i];
            }
        }
        return length == 0 ? 0 : idx + 1;
    }
}
