package com.itranswarp.learnjava.factorial; 


import static org.junit.jupiter.api.Assertions.*;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

/** 
* Factorial Tester. 
* 
* @author <Authors name> 
* @since <pre>05/15/2020</pre> 
* @version 1.0 
*/ 
public class FactorialTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: fact(long n) 
* 
*/ 
@Test
public void testFact() throws Exception { 
//TODO: Test goes here...
    assertEquals(1, Factorial.fact(1));
    assertEquals(2, Factorial.fact(2));
    assertEquals(6, Factorial.fact(3));
    assertEquals(3628800, Factorial.fact(10));
    assertEquals(2432902008176640000L, Factorial.fact(20));
} 


} 
