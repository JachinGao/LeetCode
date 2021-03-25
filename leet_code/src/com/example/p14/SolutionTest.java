package com.example.p14;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void longestCommonPrefix() {
        Solution solution = new Solution();
        String[] strs = {"flower", "flow", "flight"};
        String s = solution.longestCommonPrefix(strs);
        System.out.println("pre:" + s);
    }
}