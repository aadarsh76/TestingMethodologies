package com.report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestExtntRep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pth=System.getProperty("user.dir")+"\\Reports\\";
		String rpth="Execution_Report_1.html";
		String rname=pth+rpth;
		
		System.out.println(rname);
		
		ExtentHtmlReporter reporter=new ExtentHtmlReporter(rname);
		
		ExtentReports extent=new ExtentReports();
		
		extent.attachReporter(reporter);
		
		ExtentTest test1=extent.createTest("test1","valid login");
		
		test1.log(Status.PASS,"valid login pass");
		
        ExtentTest test2=extent.createTest("test2","valid login");
		
		test2.log(Status.FAIL,"valid login fail");
		
		extent.flush();

	}

}
