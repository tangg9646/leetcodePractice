package com.itranswarp.learnjava.num283_move_zeroes;

public class DoubleTraverseMethod {
    public void moveZeroes(int[] nums) {
        //两次遍历
        //两个指针 i  和 j
        //- i用于循环遍历数组
        //- j用于指示，完成对第i个数的判断后，当前有多少个非零的数字

        //在第一次遍历中
        //- 每次，如果遇到0，则本次循环不做任何处理
        //- 如果遇到非零，则，将当前非零数组赋值给nums[j]这个位置，然后j++,往后挪移一位，为下次遇到非零的数字，存入nums[j]做好准备

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        System.out.println("结束第一次遍历后，j的值：" + j);

        //第二次遍历中，因为第一次遍历已经将所有非零的数字放置于前方，并知道了非零数字的个数
        //因此，只需要将后面的全部填充为0
        for (int i = j; i < nums.length; i++) {
            System.out.println("填充num[" + i + "]的值为0" );
            nums[i] = 0;
        }
    }

}
