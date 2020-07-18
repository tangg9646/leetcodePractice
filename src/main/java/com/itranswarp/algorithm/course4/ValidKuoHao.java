package com.itranswarp.algorithm.course4;

import java.util.HashMap;
import java.util.Stack;

public class ValidKuoHao {

    // 判断输入字符串是否是有效字符串
    public boolean isValid(String s) {
        // 特例
        if (s=="" || s.length()==0) return true;
        if (s.length() % 2 == 1) {
            return false;
        }

        //
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        if (map.containsKey(s.charAt(0))) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            // 判断是左还是右
            char c = s.charAt(i);
            // 如果是左括号，直接进展
            if (map.containsValue(c)) {
                stack.push(c);
            } else {
                // 否则是右括号，应该检查栈顶是否是对应左括号
                if (stack.peek() == map.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();

    }
}
