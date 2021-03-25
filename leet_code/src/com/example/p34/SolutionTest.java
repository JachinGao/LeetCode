package com.example.p34;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
    private Solution solution;

    @Before
    public void setUp() {
        System.out.println("before");
        solution = new Solution();
    }

    @Test
    public void testSearchRange() {
        int[] res = solution.searchRange(null, 9);
        for (int re : res) {
            System.out.print(re + ", ");
        }
    }
}