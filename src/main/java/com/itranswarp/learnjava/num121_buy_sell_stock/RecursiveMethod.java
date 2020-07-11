package com.itranswarp.learnjava.num121_buy_sell_stock;

public class RecursiveMethod {
    //分治算法，采用递归求解

    //计算在数组里面指定数字出现的次数
    private int countRange(int[] nums, int num, int lo, int hi) {
        int count = 0;

        //遍历lo 到 hi的子数组
        for (int i = lo; i <= hi; i++) {
            if (nums[i] == num) {
                count++;
            }
        }

        return count;
    }

    //计算指定区间的数组的众数
    private int majorityElementRec(int[] nums, int lo, int hi) {
        //
        if (lo == hi) {
            return nums[lo];
        }

        //计算左右两部分分别的众数
        int mid = (hi - lo) / 2 + lo;
        int left = majorityElementRec(nums, lo, mid);
        int right = majorityElementRec(nums, mid+1, hi);

        //根据计算出的结果判断众数
        if (left == right) {
            return left;
        }

        //左右两部分计算出的众数不相等，则分别判断那部分众数的出现次数多，多的为最终众数
        int leftCount = countRange(nums, left, lo, hi);
        int rightCount = countRange(nums, right, lo, hi);

        return leftCount > rightCount ? left : right;
    }

    public int majorityElement(int[] nums) {
        return majorityElementRec(nums, 0, nums.length - 1);
    }

}
