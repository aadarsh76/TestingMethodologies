package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;

public class TestJenk {
  @Test
  public void test1() {
	  System.out.println("test1");
	  WebDriver driver = new EdgeDriver();
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  driver.findElement(By.id("login1")).sendKeys("aadarsh");
	  driver.findElement(By.id("password")).sendKeys("password");
	  driver.findElement(By.id(""));
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method T");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method T");
  }

}
