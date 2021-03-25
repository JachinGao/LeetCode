package com.offer.p04;

import org.junit.Test;

public class P4Test {

    @Test
    public void findNumberIn2DArray() {
        int[][] arrs = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        P4 p4 = new P4();
        boolean numberIn2DArray = p4.findNumberIn2DArray(arrs, 20);
        System.out.println(numberIn2DArray);
    }
}