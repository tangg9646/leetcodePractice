package com.itranswarp.learnjava.quickSort;

import java.util.Arrays;

public class QuickSort {

//    // 快速排序
//
//    // 挖坑填数
//    // 返回值是最终 基准值 位于数组中的位置
//    public int adjustArray(int[] nums, int leftindex, int rightindex) {
//        int left = leftindex;
//        int right = rightindex;
////        int l = left, r = right;
//        int pivot = nums[left];
//        while (left < right) {
//
//            //从后向前寻找，找到小于基准值的就交换
//            while (left < right && nums[right] < pivot){
//                right--;
//            }
//
//            // 找到后，用后找到的数字，填上前一个坑
//            if (left < right) {
//                nums[left] = nums[right];
//                left++;
//            }
//
//            // 开始从前往后找大于 基准值的数字
//            while (left < right && nums[left] > pivot) {
//                left++;
//            }
//            // 找到后，用当前数字，填上上一个坑
//            if (left < right) {
//                nums[right] = nums[left];
//                right--;
//            }
//        }
//
//        // 将基准值填入最终的坑中
//        nums[left] = pivot;
//
//        return left;
//    }
//
//    // 开始分治
//    void quickSort(int[] nums, int left, int right){
//        if (left < right) {
//            int nextLeft = adjustArray(nums, left, right);
//            // 左区间再次快排
//            adjustArray(nums, left, nextLeft - 1);
//            adjustArray(nums, nextLeft + 1, right);
//        }
//    }


//    void quickSortAll(int[] nums, int leftIndex, int rightIndex) {
//        if (leftIndex < rightIndex) {
//            int left = leftIndex;
//            int right = rightIndex;
//            int pivot = nums[left];
//
//            while (left < right) {
//                // 从后往前
//                while (left < right && nums[right] <= pivot) {
//                    right--;
//                }
//                if (left < right) {
//                    nums[left] = nums[right];
//                    //left++;
//                }
//
//                // 从前往后
//                while (left < right && nums[left] >= pivot) {
//                    left++;
//                }
//                if (left < right) {
//                    nums[right] = nums[left];
//                    //right--;
//                }
//            }
//
//            nums[left] = pivot;
//
//            quickSortAll(nums, leftIndex, left - 1);
//            quickSortAll(nums, right + 1, rightIndex);
//        }
//
//    }


    private  void quickSort222(int[] arr, int leftIndex, int rightIndex) {
        if (leftIndex >= rightIndex) {
            return;
        }

        int left = leftIndex;
        int right = rightIndex;
        //待排序的第一个元素作为基准值
        int key = arr[left];

        //从左右两边交替扫描，直到left = right
        while (left < right) {

            while (right > left && arr[right] >= key) {
                //从右往左扫描，找到第一个比基准值小的元素
                right--;
            }

            //找到这种元素将arr[right]放入arr[left]中
            arr[left] = arr[right];

            while (left < right && arr[left] <= key) {
                //从左往右扫描，找到第一个比基准值大的元素
                left++;
            }

            //找到这种元素将arr[left]放入arr[right]中
            arr[right] = arr[left];
        }
        //基准值归位
        arr[left] = key;
        //对基准值左边的元素进行递归排序
        quickSort222(arr, leftIndex, left - 1);
        //对基准值右边的元素进行递归排序。
        quickSort222(arr, right + 1, rightIndex);
    }

    public static void main(String[] args) {
        QuickSort solution = new QuickSort();
        int[] nums = {8, 1, 2, 4, 5, 6, 7};
//        solution.quickSort(nums, 0, nums.length - 1);

//        solution.quickSortAll(nums, 0, nums.length-1);
        solution.quickSort222(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));





    }


}
