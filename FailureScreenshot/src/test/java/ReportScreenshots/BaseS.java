package ReportScreenshots;

import java.io.File;
import java.io.IOException;

//import org.apache.commons.io.CopyUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseS {
	public static WebDriver driver;
	
	public static void initialization() {
	driver=new EdgeDriver();
	driver.get("http://www.google.com");
	}
	
//	public static void onQuit() {
//		driver.quit();
//	}
	
	public static void failed1(String fileName) {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path="C:\\Users\\aamertia\\eclipse-workspace\\Maven\\FailureScreenshot\\ScreenShots\\"+fileName;
		try {
			FileUtils.copyFile(src, new File(path+"\\"+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
