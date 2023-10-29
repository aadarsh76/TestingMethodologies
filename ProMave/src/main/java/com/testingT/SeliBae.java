package com.testingT;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeliBae {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	String url = "https://www.cleartrip.com/";
	driver.get(url);

	try {
	Thread.sleep(6000);
	}catch(InterruptedException e1) {
	e1.printStackTrace();
	}
	// driver.findElement(By.xpath("//*[@class=' c-pointer c-neutral-901']")).click();

	try {
	// driver.findElement(By.xpath("//*[contains(@class,'c-pointer')][contains(@class,'c-neutral-900')]")).click();
	// driver.findElement(By.xpath("//*[contains(@class,' c-pointer c-neutral-900')]")).click();
	driver.findElement(By.xpath("//*[@class=' c-pointer c-neutral-900']")).click();
	}
	catch(Exception e) {
	System.out.println("pop1 up not present");

	}
	String filepath = "C:\\Users\\akashv\\PracAutomation\\Evidense\\imageCleartrip.png";
	File fileEv = new File(filepath);
	driver.findElement(By.xpath("//div[contains(@class,'homeCalender')]/button[1]")).click();
	TakesScreenshot screenshot = (TakesScreenshot)driver;
	File scFile = screenshot.getScreenshotAs(OutputType.FILE);
	try {
	FileUtils.copyFile(scFile, fileEv);
	} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}


	}

	

}
}
