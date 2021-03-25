package com.example.p13;

/**
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * <p>
 * 示例1:
 * 输入:"III"
 * 输出: 3
 * <p>
 * 示例2:
 * 输入:"IV"
 * 输出: 4
 * <p>
 * 示例3:
 * 输入:"IX"
 * 输出: 9
 * <p>
 * 示例4:
 * 输入:"LVIII"
 * 输出: 58
 * 解释: L = 50, V= 5, III = 3.
 * <p>
 * 示例5:
 * 输入:"MCMXCIV"
 * 输出: 1994
 * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/roman-to-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */


public class Solution {

    public int romanToInt(String s) {
        int length = s.length();
        int idx = 0;
        int total = 0;
        while (idx < length) {
            char c = s.charAt(idx);
            char next = idx + 1 == length ? 'Z' : s.charAt(idx + 1);
            int tmp = 0;

            switch (c) {
                case 'I':
                    if (next == 'V') {
                        tmp = 4;
                        idx += 2;
                    } else if (next == 'X') {
                        tmp = 9;
                        idx += 2;
                    } else {
                        tmp = 1;
                        idx += 1;
                    }
                    break;
                case 'X':
                    if (next == 'L') {
                        tmp = 40;
                        idx += 2;
                    } else if (next == 'C') {
                        tmp = 90;
                        idx += 2;
                    } else {
                        tmp = 10;
                        idx += 1;
                    }
                    break;
                case 'C':
                    if (next == 'D') {
                        tmp = 400;
                        idx += 2;
                    } else if (next == 'M') {
                        tmp = 900;
                        idx += 2;
                    } else {
                        tmp = 100;
                        idx += 1;
                    }
                    break;
                case 'V':
                    tmp = 5;
                    idx += 1;
                    break;
                case 'L':
                    tmp = 50;
                    idx += 1;
                    break;
                case 'D':
                    tmp = 500;
                    idx += 1;
                    break;
                case 'M':
                    tmp += 1000;
                    idx += 1;
                    break;
            }
            total += tmp;
        }
        return total;
    }
}
