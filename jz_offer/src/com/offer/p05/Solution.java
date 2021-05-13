package com.offer.p05;

public class Solution {
    public String replaceSpace(String s) {
        char[] chars = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char aChar : chars) {
            if (aChar == ' '){
                builder.append("%20");
            }else {
                builder.append(aChar);
            }
        }
        return builder.toString();
    }
}
