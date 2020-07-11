package com.itranswarp.learnjava.num15_3sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_3sum {
    //排序加双指针解法
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> lists = new ArrayList<>();

        //特例，长度不满足或者为null
        if (nums == null || nums.length<3) return lists;

        //不是特例，则先进行排序
        Arrays.sort(nums);

        //对排序后的数组 按双指针规则进行遍历
        int len = nums.length;

        for (int i=0; i<len; i++){
            //- 从第一个数字开始，对后面剩下的len-i个数组，用双指针遍历
            //- 如果当前这个数字，已经大于0，则，剩下的不可能得到三个数字和为零，返回空
            if (nums[i]>0) return lists;

            //- 判断当前数字和上一个数字是否相等，如果相等，则跳过此次循环
            if (i>0 && nums[i] == nums[i-1]) continue;

            //- 双指针遍历剩下的len-i个数组，检查是否满足条件
            int lp = i+1;
            int rp = len -1;

            //-- 开始双指针遍历剩下的数组
            while (lp < rp){
                int sum = nums[i] + nums[lp] + nums[rp];
                if (sum == 0){
                    lists.add(Arrays.asList(nums[i], nums[lp], nums[rp]));
                    //--- 由于可能存在多个解，因此，还需要继续移动指针，并判断是否重复解集（左界和右界是否和各自的下一位置重复）
                    //--- 可能有很多个相同的值(注意左右指针的大小条件)

                    //---- 若下一位置的真的有重复且相等
                    while ( lp < rp && (nums[lp] == nums[lp+1])) lp++;
                    while ( lp < rp && (nums[rp] == nums[rp-1])) rp--;

                    //---- 下一位置并不重复
                    //---- 如果下一位置并不重复的话，由于上一次的sum=0，因此，需要左右界同时向内收缩
                    //---- 如果只收缩左界或者右界，肯定结果不为0
                    lp++;
                    rp--;
                }
                else if (sum < 0) lp++;
                else rp--;
            }
        }

        return lists;
    }
}
