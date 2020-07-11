package com.itranswarp.learnjava.quickSort;


// 写个快速排序练练手

import java.util.Arrays;

public class QuickSort2 {

    public void quickSort(int[] arr, int leftIndex, int rightIndex) {

        // 判断特例
//        if (arr.length<2) return arr;

        // 终止条件
        if (leftIndex >= rightIndex) {
            return;
        }

        int left = leftIndex;
        int right = rightIndex;
        int pivot = arr[left];

        // 开始处理当前 挖坑填数  的逻辑
        while (left < right) {

            // 从后往前搜索 找比pivot小的数字
            while (left < right && arr[right] >= pivot) {
                right--;
            }
            // 找到后，交换填坑
            if (left < right) {
                arr[left] = arr[right];
                left++;
            }

            // 从前往后搜索 找比pivot大的数字
            while (left < right && arr[left] <= pivot) {
                left++;
            }
            // 找到后，交换
            if (left < right) {
                arr[right] = arr[left];
                right--;
            }
        }
        // 基准值归为
        arr[left] = pivot;

        // 递归进行分治
        quickSort(arr, leftIndex, left - 1);
        quickSort(arr, right + 1, rightIndex);

//        return;
    }

    public static void main(String[] args) {
        QuickSort2 quickSort2 = new QuickSort2();
        int[] nums = {8, 1, 2, 4, 5, 6, 7};
        quickSort2.quickSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}
