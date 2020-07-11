package com.itranswarp.learnjava;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] height =new int[]{1, 8, 6, 5, 4};

        int[] sub_arr =new int[]{1, 2, 3, 4, 5};
        System.arraycopy(height,0, sub_arr, 0,height.length);

        System.out.println(Arrays.toString(height));
        System.out.println(Arrays.toString(sub_arr));

        int[] des;
        des = Arrays.copyOfRange(height, 0, 3);

        System.out.println(Arrays.toString(des));

    }
}
