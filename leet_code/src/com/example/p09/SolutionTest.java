package com.example.p09;

import org.junit.Test;

public class SolutionTest {


    @Test
    public void isPalindrome() {
        Solution solution = new Solution();
        boolean palindrome = solution.isPalindrome(-121);
        System.out.println(palindrome);
    }
}