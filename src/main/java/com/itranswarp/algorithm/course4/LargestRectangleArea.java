package com.itranswarp.algorithm.course4;

import java.util.Arrays;
import java.util.Stack;

public class LargestRectangleArea {
    public int largestRectangleArea(int[] heights) {
        // 找出柱状图中的最大矩形的面积

        // 使用栈
        // 每新加一个元素进展，判断是否比栈顶元素更小
        // 如果更小，说明当前栈顶元素的左边界已经确定（由于是依次处理，所以左边界就是栈顶元素）

        // 特例
        if (heights == null || heights.length == 0) {
            return 0;
        }

        // 存放的是heights中元素的下标Index
        Stack<Integer> stack = new Stack<>();

        int len = heights.length;
        int maxArea = Integer.MIN_VALUE;

        // 遍历heights
        for (int i = 0; i < len; i++) {

            // 判断对于当前元素，是压栈，还是执行相应操作后出栈

            // 如果是出栈，需要持续pop到满足条件为止
            // 例如是4 7 3 当前循环到数字3
            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                // 7 * (2 - (0+1)) = 1
                int localMaxAera = heights[stack.pop()] * (i - (stack.isEmpty() ? 0 : stack.peek() + 1));
                maxArea = Math.max(maxArea, localMaxAera);
            }

            // 结束上述循环后，当前数字可以进栈
            stack.push(i);
        }


        // 到达数组尾部，现在栈内元素就是从小到大垒起来的
        // 由于上述处理完后栈为非空，所以，原数组最后一个元素肯定是最小的
        while (!stack.isEmpty()) {
            int localMaxAera = heights[stack.pop()] * (len - (stack.isEmpty() ? 0 : stack.peek() + 1));
            localMaxAera = Math.max(localMaxAera, maxArea);
        }

        return maxArea;
    }

    // 采用简单的思路
    // 枚举每根棍子的高度
    public int largestRectangleArea2(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }

        int n = heights.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {

            int height = heights[i];
            int left = i;
            int right = i;

            // 寻找左右边界
            while (left - 1 >= 0 && heights[left - 1] >= height) {
                left--;
            }
            while (right + 1 < n && heights[right + 1] >= height) {
                right++;
            }

            // 计算面积
            ans = Math.max((height * (right - left + 1)), ans);
        }

        return ans;
    }

}
