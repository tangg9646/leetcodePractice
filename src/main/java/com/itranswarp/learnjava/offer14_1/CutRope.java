package com.itranswarp.learnjava.offer14_1;

public class CutRope {

    // 剪断绳子
    // 长度n > 1  分成m短， m>1 最后乘积最大
    public int cuttingRope(int n) {
        // 长度2 3 4 特殊处理
        if (n == 2) {
            return 1;
        } else if (n == 3) {
            return 2;
        } else if (n == 4) {
            return 4;
        } else {

            // 否则，其他长度应该尽量拆分成多个长度为3的子段
            int count3 = n / 3;
            int left = n % 3;

            if (left == 0) {
                // 整除
                return (int) Math.pow(3, count3);
            } else if (left == 1) {
                // 余数为1
                // 将这个1和一个3凑成 4
                return (int) (Math.pow(3, count3 - 1) * 4);
            } else {
                //余数为2
                return (int) (Math.pow(3, count3) * 2);
            }

        } 
    }

}
