package com.example.p26;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void removeDuplicates() {
        Solution p_26 = new Solution();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int i = p_26.removeDuplicates(nums);
        System.out.println("length：" + i);

        int[] nums2 = {};
        int i1 = p_26.removeDuplicates(nums2);
        System.out.println("length：" + i1);
    }
}