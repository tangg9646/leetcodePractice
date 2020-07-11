package com.itranswarp.learnjava.num283_move_zeroes;

public class QuickSortMethoe {
    public void moveZeroes(int[] nums) {
        //一次遍历
        //参考快速排序的思想
        //两个指针i j
        //i 用于遍历数组中的每一个数字
        //j 初始为0，用于在判断nums[i] != 0的时候，将nums[i]  nums[j] 交换

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j++;
            }
        }
    }
}
