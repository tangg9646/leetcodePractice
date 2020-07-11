package com.itranswarp.learnjava.longestPalindrome;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import com.itranswarp.learnjava.longestPalindrome.ViolentSolution.*;

/** 
* ViolentSolution Tester. 
* 
* @author <Authors name> 
* @since <pre>05/15/2020</pre> 
* @version 1.0 
*/ 
public class ViolentSolutionTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: longest_Violent(String s) 
* 
*/ 
@Test
public void testLongest_Violent() throws Exception { 
//TODO: Test goes here...
    String test = "abcdcbacd";
    ViolentSolution solution = new ViolentSolution();
    assertEquals("abcdcba", solution.longest_Violent(test));
} 

/** 
* 
* Method: longestPalindrome_Violent_Check(@NotNull String ss) 
* 
*/ 
@Test
public void testLongestPalindrome_Violent_Check() throws Exception { 
//TODO: Test goes here...
    String test = "abcba";
    ViolentSolution solution = new ViolentSolution();
    assertTrue(solution.longestPalindrome_Violent_Check(test));

    String test2 = "abcde";
    assertFalse(solution.longestPalindrome_Violent_Check(test2));
} 


} 
