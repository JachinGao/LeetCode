package com.offer.p05;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void replaceSpace() {
        Solution solution = new Solution();
        String s = solution.replaceSpace("We are happy.");
        System.out.println(s);
    }
}