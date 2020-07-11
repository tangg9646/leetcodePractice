package com.itranswarp.learnjava.num16_3sum_closest;

import java.util.Arrays;

//采用双指针的方法，排序后，根据sum的结果，判断左移还是右移指针
public class Solution {
    public int threeSumClosest(int[] nums, int target){
        //特例1

        if (nums==null || nums.length<3) throw new IllegalArgumentException("Invalid input nums");
        if (nums.length == 3) return nums[0]+nums[1]+nums[2];

        //先对数组进行排序
        Arrays.sort(nums);

        //随意初始化一个ans
        int ans = nums[0]+nums[1]+nums[2];

        //每个循环中，对剩下的数组进行双指针遍历
        for (int i=0; i<nums.length; i++){
            //定义左右指针
            int lp = i+1, rp = nums.length-1;

            //循环左右指针
            while (lp < rp){
                //- 根据sum和target的大小关系，决定怎么移动指针
                int sum = nums[i] + nums[lp] + nums[rp];

                //-- 如果相等，肯定是最接近的，直接返回
                if (sum == target) return target;
                //-- 如果sum<target，则右移左指针，使得结果接近于target
                else if (sum < target ){
                    //--- 判断此sum是否是和target更加接近，如果是，则更新sum
                    if (Math.abs(target - sum) < Math.abs(target - ans)) ans = sum;
                    lp++;
                }else {
                    //-- sum>target，则左移右指针
                    if (Math.abs(target - sum) < Math.abs(target - ans)) ans = sum;
                    rp--;
                }
            }
        }
       return ans;

    }
}
