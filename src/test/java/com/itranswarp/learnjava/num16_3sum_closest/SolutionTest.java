package com.itranswarp.learnjava.num16_3sum_closest; 


import static org.junit.jupiter.api.Assertions.*;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

/** 
* Solution Tester. 
* 
* @author <Authors name> 
* @since <pre>05/16/2020</pre> 
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
* Method: threeSumClosest(int[] nums, int target) 
* 
*/ 
@Test
public void testThreeSumClosest() throws Exception { 
//TODO: Test goes here...
    Solution solution = new Solution();
    int[] test = new int[]{-1,2,1,-4,1};
    int[] test2 = new int[]{-4,-1,-1,0,1,2};

//    System.out.println(solution.threeSumClosest(test, 1));
    System.out.println(solution.threeSumClosest(test2, 1));

}


} 
