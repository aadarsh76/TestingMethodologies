package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;
//import org.testng.annotations.BeforeMethod;


public class TestOperations {
Caluculator lib=new Caluculator();



  @Test
  public void Test1() {
	  
	  int act=lib.add1(2, 10);
	  int exp=12;
	  
	  Assert.assertEquals(act, exp);
  }
  
  @Test
  public void Test2() {
	  int act=lib.sub(45, 25);
	  int exp=20;
	  Assert.assertEquals(act, exp);
  }
  

  

}
