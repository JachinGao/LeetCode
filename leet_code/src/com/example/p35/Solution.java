package com.example.p35;

public class Solution {

    /**
     * 使用折半查找法
     *
     * @param nums   输入数组
     * @param target 查找值
     * @return 返回索引
     */
    public int searchInsert(int[] nums, int target) {
        int length = nums.length;
        int left = 0;
        int right = length - 1;
        int mid;

        while (left <= right) {
            mid = (left + right) / 2;
            if (target <= nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
