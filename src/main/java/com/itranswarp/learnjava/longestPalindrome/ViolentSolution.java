package com.itranswarp.learnjava.longestPalindrome;

import org.jetbrains.annotations.NotNull;

public class ViolentSolution {
    public String longest_Violent(String s){
        //暴力求解，找出每一个子串并检验是否是子串

        //如果是空或者空字符串，返回空字符串
        if (s == null || s == "") return "";

        //如果只有一个字符，直接返回该字符
        if (s.length() == 1) return s;

        //字符串长度为2或者以上
        //记录子串的长度
        int max_len = 0;
        String result = "";
        int s_len = s.length();
        for (int i=0; i<=s_len; i++){
            for (int j=i+2; j<=s_len; j++){
                if (longestPalindrome_Violent_Check(s.substring(i,j))){
                    if ((j-i) > max_len){
                        max_len = j-i;
                        result = s.substring(i,j);
                    }
                }
            }
        }
        return result;

    }

    public boolean longestPalindrome_Violent_Check(@NotNull String ss){
        //检验一个子串是否为回文
        //将原始子串从中间对折，观察左右字符是否相等
        //这里ss的长度是2或者2以上
        int ss_len = ss.length();
        for (int i=0; i<ss_len/2; i++){
            if (ss.charAt(i) != ss.charAt(ss_len-i-1)) return false;
        }
        return true;
    }
}
