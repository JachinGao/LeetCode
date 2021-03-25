package com.example.p38;

public class Solution {
    public static void main(String[] args) {

    }

    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }

        String s = countAndSay(n - 1);
        int length = s.length();
        int cnt = 1;
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            if (i < length - 1 && (s.charAt(i) == s.charAt(i + 1))) {
                cnt++;
            } else {
                builder.append(cnt).append(s.charAt(i));
                cnt = 1;
            }
        }
        return builder.toString();
    }
}
