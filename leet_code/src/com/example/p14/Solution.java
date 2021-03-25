package com.example.p14;

public class Solution {

    public String longestCommonPrefix(String[] strs) {
        int length = strs.length;

        if (length == 0) {
            return "";
        }

        int len = strs[0].length();
        for (int i = 0; i < len; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < length; j++) {
                if (i == strs[j].length()
                        || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
