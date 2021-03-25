package com.example.p20;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isValid() {
        Solution p_20 = new Solution();
        boolean valid = p_20.isValid(")");
        System.out.println(valid);
    }
}