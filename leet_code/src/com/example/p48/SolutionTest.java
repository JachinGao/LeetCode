package com.example.p48;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void rotate() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int[][] matrix2 = {
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}};

        Solution p_48 = new Solution();
        reverse(matrix2);
        p_48.rotate(matrix2);
        System.out.println("\n");
        reverse(matrix2);
    }

    private void reverse(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%2d ", ints[j]);
            }
            System.out.println();
        }
    }
}