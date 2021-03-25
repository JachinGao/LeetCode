package com.example.p13;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void romanToInt() {
        Solution solution = new Solution();
        int ix = solution.romanToInt("MCMXCIV");
        System.out.println(ix);
    }
}