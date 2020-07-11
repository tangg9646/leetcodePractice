package com.itranswarp.learnjava.num121_buy_sell_stock; 


import static org.junit.jupiter.api.Assertions.*;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import javax.swing.*;

/** 
* Solution Tester. 
* 
* @author <Authors name> 
* @since <pre>05/18/2020</pre> 
* @version 1.0 
*/ 
public class SolutionTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: maxProfit(int[] prices) 
* 
*/ 
@Test
public void testMaxProfit() throws Exception { 
//TODO: Test goes here...
    Solution solution = new Solution();
    int[] test = new int[]{7,1,5,3,6,4};

    System.out.println(solution.maxProfit(test));


    int[] test2 = new int[]{};
    System.out.println(solution.maxProfit(test2));
} 


} 
