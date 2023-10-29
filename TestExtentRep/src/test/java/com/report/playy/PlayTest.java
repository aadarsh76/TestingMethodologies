package com.report.playy;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class PlayTest {
	ExtentReports extent;
  @Test
  public void Test1() {
	  ExtentTest test1=extent.createTest("test1","valid login");
		
		test1.log(Status.PASS,"valid login pass");
  }
  
  @Test
  public void Test2() {
	  ExtentTest test2=extent.createTest("test1","valid login");
		
		test2.log(Status.FAIL,"valid login fail");
  }
  
  @BeforeClass
  public void beforeClass() {
	  String pth=System.getProperty("user.dir")+"\\Reports\\";
		String rpth="Execution_Report_1.html";
		String rname=pth+rpth;
		
		System.out.println(rname);
		
		ExtentHtmlReporter reporter=new ExtentHtmlReporter(rname);
		
		extent=new ExtentReports();
		
		extent.attachReporter(reporter);
	  
  }

  @AfterClass
  public void afterClass() {
	  extent.flush();
  }

}
