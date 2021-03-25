package com.example.p20;

import java.util.Stack;

public class Solution {


    public boolean isValid(String s) {
        if (s == null) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            switch (aChar) {
                case '[':
                case '(':
                case '{':
                    stack.push(aChar);
                    break;
                default:
                    if (stack.size() == 0) {
                        return false;
                    }
                    Character peekChar = stack.peek();
                    if (aChar == ']' && peekChar == '['
                            || aChar == ')' && peekChar == '('
                            || aChar == '}' && peekChar == '{') {
                        stack.pop();
                    } else {
                        return false;
                    }
            }
        }
        return stack.isEmpty();
    }
}
