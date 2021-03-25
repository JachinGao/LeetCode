package com.example.p49;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void groupAnagrams() {
        Solution p_49 = new Solution();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> lists = p_49.groupAnagrams2(strs);
        for (List<String> list : lists) {
            System.out.println(list);
        }
    }
}