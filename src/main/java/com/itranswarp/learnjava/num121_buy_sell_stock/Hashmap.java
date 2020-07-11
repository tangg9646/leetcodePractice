package com.itranswarp.learnjava.num121_buy_sell_stock;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    //遍历数组，将数组数字添加作为键 出现的次数作为值
    private Map<Integer, Integer> countNums(int[] nums){
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            //判断num是否以及存在于hashmap中
            if (!counts.keySet().contains(num)) counts.put(num, 1);
            else counts.put(num, counts.get(num) + 1);
        }
        return counts;
    }

    public int majorityElement(int[] nums){
        //获取排序后的hashmap
        Map<Integer, Integer> counts = countNums(nums);

        //遍历hashmap取出，值最大的键
        Map.Entry<Integer, Integer> tempMap = null;
        for (Map.Entry<Integer, Integer> entry: counts.entrySet()){
            if (tempMap == null || entry.getValue() > tempMap.getValue()) {
                tempMap = entry;
            }
        }
        return tempMap.getValue();
    }
}
