package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginPage {
	public void printLogin(String strUN, String strPwd) {
//		System.out.println(strUN +" "+ strPwd);
		
		
		WebDriver driver=new EdgeDriver();
		
		String URL="https://mail.rediff.com/cgi-bin/login.cgi";
		driver.get(URL);
//		driver.manage().window().maximize();
		driver.findElement(By.id("login1")).sendKeys(strUN);
		driver.findElement(By.id("password")).sendKeys(strPwd);
		driver.findElement(By.name("proceed")).click();
		Boolean b=driver.findElement(By.name("proceed")).isDisplayed();
		if(b) {
			System.out.println(strUN+" "+strPwd+" "+"invalid");
		}
		else {
			System.out.println(strUN+" "+strPwd +" "+"valid");
		}
	}

}
