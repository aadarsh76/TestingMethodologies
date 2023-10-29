package com.report.testgroups;

import org.testng.annotations.Test;

public class TestGroups {
  @Test(groups = {"invalid login","login"})
  public void Test1() {
	  System.err.println("invalid login");
  }
  @Test(groups = {"valid login","login","smoke"})
  public void Test2() {
	  System.err.println("valid login");
  }
  @Test(groups = {"smoke","compose"})
  public void Test3() {
	  System.err.println("compose");
  }
}
