package com.example.p07;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void optimalSolution() {
        int reverse = reverse(153423646);
        System.out.println(reverse);

        int i = solution.optimalSolution(-1534236469);
        System.out.println(i);
    }

    public int reverse(int x) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean isPositive = x >= 0;
        int temp = isPositive ? x : -x;

        while (temp > 0) {
            list.add(temp % 10);
            temp = temp / 10;
        }

        long val = 0;

        for (Integer integer : list) {
            val = integer + val * 10;
        }
        if (val > Integer.MAX_VALUE || val < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) (isPositive ? val : -val);
    }
}