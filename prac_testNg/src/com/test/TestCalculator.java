package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestCalculator {
	Caluculator calculator=new Caluculator();
  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class");
  }

  @Test
  public void test3() {
	  int exp=30;
	  int act=calculator.add1(23, 7);
	  Assert.assertEquals(act, exp);
  }
  @Test
  public void test4() {
	  int exp=30;
	  int act=calculator.sub(23, 7);
	  Assert.assertEquals(act, exp);
  }
  @AfterClass
  public void afterClass() {
	  System.out.println("after class");
  }

}
