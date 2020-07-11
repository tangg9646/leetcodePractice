package com.itranswarp.learnjava.num121_buy_sell_stock;

import java.util.Random;
public class RandomMethod {
    //获取随机数组下标的子函数
    private int randRange(Random rand, int min, int max) {
        return rand.nextInt(max - min) + min;
    }

    //计算当前选中的数字在数组中出现的总的次数
    private int countNum(int[] nums, int targrt) {
        int times = 0;
        //遍历数组
        for (int num : nums) {
            if (num == targrt) {
                times++;
            }
        }
        return times;
    }

    //寻找众数
    public int majorityElement(int[] nums) {
        //众数的长度
        int majorCount = nums.length / 2;

        Random rand = new Random();
        //随机寻找并判断
        while (true) {
            int candidate = nums[randRange(rand, 0, nums.length)];
            int times = countNum(nums, candidate);
            if (times > majorCount) {
                return candidate;
            }
        }
    }

}
