package com.itranswarp.learnjava.num11mostwater; 


import static org.junit.jupiter.api.Assertions.*;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

/** 
* DoublePointer Tester. 
* 
* @author <Authors name> 
* @since <pre>05/15/2020</pre> 
* @version 1.0 
*/ 
public class DoublePointerTest { 

@Before
public void before() throws Exception { 
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
    DoublePointer mostwater = new DoublePointer();
    int[] test = new int[] {1,8,6,2,5,4,8,3,7};
    System.out.println(mostwater.maxArea(test));
    assertEquals(49, mostwater.maxArea(test));
} 


} 
