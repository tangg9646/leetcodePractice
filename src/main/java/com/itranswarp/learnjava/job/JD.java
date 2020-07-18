package com.itranswarp.learnjava.job;

import java.util.Arrays;

public class JD {

    public void  qiuckSort(int[] arr, int leftIndex, int rightIndex) {
        // 快排  挖坑填数   分治

        // 特例
        if (leftIndex >= rightIndex) {
            return;
        }

        int left = leftIndex;
        int right = rightIndex;
        int pivot = arr[leftIndex];

        while (left < right) {
            // 从后往前搜索  找比pivot小的数字
            while (left < right && arr[right] >= pivot) {
                right--;
            }
            if (left < right) {
                arr[left] = arr[right];
                //right++;
            }

            // 从前往后搜索，找比pivot大的数字
            while (left < right && arr[left] <= pivot) {
                left++;
            }
            if (left < right) {
                arr[right] = arr[left];
               // left++;
            }

            // 基准值归位
            arr[left] = pivot;
            // 分治
            qiuckSort(arr, leftIndex, left - 1);
            qiuckSort(arr, rightIndex + 1, rightIndex);
        }
    }


    public void selectSort(int[] arr) {
        // 选择排序
        // 从后面的选出最小的，放到已排序的数组的末尾

        // teli
        if (arr.length == 0) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            int minIndex = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            // 找到后 放置于末尾
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

    }




    public static void main(String[] args) {
        JD solution = new JD();
        int[] nums = {8, 1, 2, 4, 5, 6, 7};
        solution.qiuckSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

}
