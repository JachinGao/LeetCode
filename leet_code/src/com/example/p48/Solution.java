package com.example.p48;

public class Solution {

    public void rotate(int[][] matrix) {
        int len = matrix.length;
        int mid = (len - 1) / 2;
        for (int i = 0; i <= mid; i++) {
            for (int j = i; j < len - 1 - i; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[len - 1 - j][i];
                matrix[len - 1 - j][i] = matrix[len - 1 - i][len - 1 - j];
                matrix[len - 1 - i][len - 1 - j] = matrix[j][len - 1 - i];
                matrix[j][len - 1 - i] = tmp;
            }
        }
    }


}
