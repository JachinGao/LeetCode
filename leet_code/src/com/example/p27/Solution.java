package com.example.p27;

public class Solution {

    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int idx = 0;

        for (int i = 0; i < length; i++) {
            if (nums[i] != val) {
                if (i != idx) {
                    nums[idx] = nums[i];
                }
                idx++;
            }
        }
        return idx;
    }
}
