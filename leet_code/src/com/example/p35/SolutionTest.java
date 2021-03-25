package com.example.p35;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void searchInsert() {
        int[] muns = {1,2,3,5};
        int target = 7;
        int i = solution.searchInsert(muns, target);
        System.out.println("index is " + i);
    }
}