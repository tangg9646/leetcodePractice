package com.itranswarp.learnjava;

import java.util.Arrays;

public class Quick22 {

    private  void quickSort222(int[] arr, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {

            int left = leftIndex;
            int right = rightIndex;
            int key = arr[left];

            while (left < right) {

                while (left < right && arr[right] <= key) {
                    right--;
                }
                //if (left < right) {
                    arr[left] = arr[right];
                //}

                while (left < right && arr[left] > key) {
                    left++;
                }
                //if (left < right) {
                    arr[right] = arr[left];
                //}



            }

            arr[left] = key;

            quickSort222(arr, leftIndex, left - 1);
            quickSort222(arr, right + 1, rightIndex);


        }


    }



    private  void quickSort333(int[] arr, int leftIndex, int rightIndex) {

        if (leftIndex >= rightIndex) {
            return;
        }

        int left = leftIndex;
        int right = rightIndex;
        int key = arr[left];

        while (left < right) {

            while (left < right && arr[right] >= key) {
                right--;
            }
            if (left < right) {
            arr[left] = arr[right];
            }

            while (left < right && arr[left] <= key) {
                left++;
            }
            if (left < right) {
            arr[right] = arr[left];
            }



        }

        arr[left] = key;

        quickSort333(arr, leftIndex, left - 1);
        quickSort333(arr, right + 1, rightIndex);



    }


    public static void main(String[] args) {
        Quick22 solution = new Quick22();
        int[] nums = {8, 1, 2, 4, 5, 6, 7};
        int[] nums2 = {8, 1, 2, 4, 5, 6, 7};

//        solution.quickSort(nums, 0, nums.length - 1);

        solution.quickSort222(nums, 0, nums.length-1);
        solution.quickSort333(nums2, 0, nums2.length-1);
//        solution.quickSort222(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums2));





    }
}
