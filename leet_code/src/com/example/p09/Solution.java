package com.example.p09;

public class Solution {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        long n = 0;
        long temp = x;

        while (temp != 0) {
            n = temp % 10 + n * 10;
            temp = temp / 10;
        }
        return x == n;
    }
}
