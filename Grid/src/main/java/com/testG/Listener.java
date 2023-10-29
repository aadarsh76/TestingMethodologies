package com.testG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{
    
    @Override
    public void onStart(ITestContext context) {
        // TODO Auto-generated method stub
        System.out.println(context.getName()+"started\n");
    }
    @Override
    public void onFinish(ITestContext context) {
        // TODO Auto-generated method stub
        System.out.println(context.getName()+"Finished\n");
    }
    
    @Override
    public void onTestStart(ITestResult test) {
        // TODO Auto-generated method stub
        System.out.println(test.getName()+"Test Started \n");
    }
    
    @Override
    public void onTestSuccess(ITestResult result) {
        // TODO Auto-generated method stub
        System.out.println(result.getName()+"Test Passed \n");
    }
    
    @Override
    public void onTestFailure(ITestResult result) {
        // TODO Auto-generated method stub
        System.out.println(result.getName()+" has FAiled \n\n");
    }
    
    
    
}