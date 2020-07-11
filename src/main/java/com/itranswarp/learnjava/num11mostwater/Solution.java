package com.itranswarp.learnjava.num11mostwater;

import java.util.Arrays;

public class Solution {
    public int maxArea(int[] height) {
        //传入数组长度为n，得到n-1个数组

        int max_area = 0;

        for (int i=0; i<=height.length-2; i++){
//            int[] sub_arr = height[i, height.length];
            int[] sub_arr;
            sub_arr = Arrays.copyOfRange(height, i, height.length);
            max_area = Math.max(max_area, calcuArea(sub_arr));
        }
        return  max_area;

    }

    public int calcuArea(int[] sub_arr){
        //计算所有面积，并返回最大的面积
        int max_area = 0;
        for (int i=1; i<=sub_arr.length-1;i++){
            int len = i;
            int tall = Math.min(sub_arr[0], sub_arr[i]);
            max_area = Math.max(max_area, len * tall);
        }

        return max_area;
    }


}
