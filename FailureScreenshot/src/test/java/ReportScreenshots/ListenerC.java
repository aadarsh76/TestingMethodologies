package ReportScreenshots;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerC extends BaseS implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestStart(result);
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestSuccess(result);
	}

	public void onTestFailure(ITestResult result) {
		failed1(result.getMethod().getMethodName());
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestSkipped(result);
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
//		ITestListener.super.onStart(context);
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
//		ITestListener.super.onFinish(context);
	}

	
	

}
