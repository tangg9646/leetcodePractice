package com.itranswarp.learnjava.num53_max_subarray;

public class Solution {
    public int maxSubArray(int[] nums){
        //采用动态规划的方法
        //思路：
        //- 当前子序列的结果为sum, 答案为ans
        //- 遍历数组
        //-- 如果当前子序列sum>0，说明对最终的ans是有增益作用的，更新sum=sum+当前数字
        //-- 如果当前子序列sum<=0，说明不具有增益作用，则直接将当前数字设为当前子序列和 sum=当前数字
        //-- 比较sum和ans中较大的值，作为ans(因为上面sum>0的情况，当前数字可能是负数)
        //-- 对下一个数进行比较判断

        //- 结束遍历，返回ans

        int sum = 0;
        int ans = nums[0];

        for (int num:nums) {

            if (sum > 0){
                sum = sum + num;
            }else sum=num;

            ans = Math.max(sum, ans);
        }

        return ans;

    }
}
