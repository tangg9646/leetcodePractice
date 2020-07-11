package com.itranswarp.learnjava.num121_buy_sell_stock;

import java.awt.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int maxProfit(int[] prices) {
        //截至当前历史最低价
        //截至当前最大利差
        //遍历数组，迭代每一天的利差，与最大利差比较最大值
//        if (prices==null || prices.length<=1) throw new IllegalArgumentException("invalid input prices[]");
        if (prices==null || prices.length<=1) return 0;

        int maxProfit = 0;
        int minPriceInHistory = prices[0];

        for (int i=1; i<prices.length; i++){
            minPriceInHistory = Math.min(minPriceInHistory, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i]-minPriceInHistory);
        }

        return Math.max(maxProfit, 0);

    }

}