package com.testdd;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class ClassTdd {
  @Test
  public void Test1() {
	  System.out.println("test1class1");
  }
  @Test
  public void Test2() {
	  System.out.println("test2class1");
  }
  @Test
  public void Test3() {
	  System.out.println("test3class1");
  }
  @Test
  public void Test4() {
	  System.out.println("test4class1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method");
  }

  @AfterMethod
  public void afterMethod() {
  System.out.println("after method");
  }
  

}
