package com.tut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seltry {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
//		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//		driver.findElement(By.id("login1")).sendKeys("aadarsh76");
//		driver.findElement(By.id("password")).sendKeys("123456");
//		driver.findElement(By.className("signinbtn")).click();
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String URL="https://www.cleartrip.com/";
		driver.get(URL);
		try {
			Thread.sleep(5000);
		}
		catch(InerruptedException e1) {
			e1.printStackTrace();
		}
		driver.findElement(By.id(URL));
		
	}

}
