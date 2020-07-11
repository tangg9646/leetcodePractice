package com.itranswarp.learnjava.num283_move_zeroes; 


import static org.junit.jupiter.api.Assertions.*;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/** 
* QuickSortMethoe Tester. 
* 
* @author <Authors name> 
* @since <pre>05/20/2020</pre> 
* @version 1.0 
*/ 
public class QuickSortMethoeTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: moveZeroes(int[] nums) 
* 
*/ 
@Test
public void testMoveZeroes() throws Exception { 
//TODO: Test goes here...
    QuickSortMethoe solution = new QuickSortMethoe();
    int[] test = new int[]{0, 1, 0, 3, 12};
    System.out.println(Arrays.toString(test));
    solution.moveZeroes(test);
    System.out.println(Arrays.toString(test));
} 


} 
