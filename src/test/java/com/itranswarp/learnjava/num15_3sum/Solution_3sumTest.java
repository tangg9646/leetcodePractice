package com.itranswarp.learnjava.num15_3sum; 


import static org.junit.jupiter.api.Assertions.*;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.List;

/** 
* Solution_3sum Tester. 
* 
* @author <Authors name> 
* @since <pre>05/15/2020</pre> 
* @version 1.0 
*/ 
public class Solution_3sumTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: threeSum(int[] nums) 
* 
*/ 
@Test
public void testThreeSum() throws Exception { 
//TODO: Test goes here...
    Solution_3sum soulution = new Solution_3sum();
    int[] test = new int[] {-1, 0, 1, 2, -1, -4};
    int[] test2 = new int[] {-1, 0, 0, 0, 0, 1, 1, 1, 1, 2, -1, 4};
    System.out.println(soulution.threeSum(test));
    System.out.println(soulution.threeSum(test2));
} 


} 
