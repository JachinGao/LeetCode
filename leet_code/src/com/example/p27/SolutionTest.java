package com.example.p27;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void removeElement() {
        System.out.println("Hello World");
        Solution p_27 = new Solution();

        int[] arr = {0,1,2,2,3,0,4,2};
        int i = p_27.removeElement(arr, 2);
        System.out.println("len:" + i);

        for (int j = 0; j < i; j++) {
            System.out.println(arr[j]);
        }
    }
}