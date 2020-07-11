package com.itranswarp.learnjava.num11mostwater; 


import static org.junit.jupiter.api.Assertions.*;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

/** 
* Solution Tester. 
* 
* @author <Authors name> 
* @since <pre>05/15/2020</pre> 
* @version 1.0 
*/ 
public class SolutionTest { 

@Before
public void before() throws Exception {
    Solution mostwater = new Solution();
    int[] test = new int[] {1,8,6,2,5,4,8,3,7};
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: maxArea(int[] height) 
* 
*/ 
@Test
public void testMaxArea() throws Exception { 
//TODO: Test goes here...
    Solution mostwater = new Solution();
    int[] test = new int[] {1,8,6,2,5,4,8,3,7};
    System.out.println(mostwater.calcuArea(test));
    assertEquals(49, mostwater.maxArea(test));
} 

/** 
* 
* Method: calcuArea(int[] sub_arr) 
* 
*/ 
@Test
public void testCalcuArea() throws Exception { 
//TODO: Test goes here...
    Solution mostwater = new Solution();
    int[] test = new int[] {1,8,6,2,5,4,8,3,7};
    int[] test2 = new int[] {8,6,2,5,4,8,3,7};

    System.out.println(mostwater.calcuArea(test));
    System.out.println(mostwater.calcuArea(test2));
    assertEquals(49, mostwater.calcuArea(test2));

} 


} 
