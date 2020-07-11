package com.itranswarp.learnjava.num11mostwater;

public class DoublePointer {
    public int maxArea(int[] height){
        //双指针，指向头尾
        int i=0, j=height.length-1, area=0;

        //向内移动短板，才有可能获得最大面积
        //从左右往中间靠拢
        while (i < j){
            //如果左板比较短
            if (height[i] < height[j]){
                area = Math.max(area, height[i]*(j-i));
                //移动左板
                i++;
            }else {
                area = Math.max(area, height[j]*(j-i));
                //移动右板
                j--;
            }
        }
        return area;
    }
}
