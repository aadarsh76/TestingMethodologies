package com.rediff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffSign {

	public static void main(String[] args) {
		 WebDriver driver=new EdgeDriver();
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 driver.findElement(By.xpath("//a/u[text()='Create a new account']")).click();
		 Select selDay=new Select(driver.findElement(By.xpath("//*contains[@name,'DOB_Day']")));
		 selDay.selectByVisibleText("19");

	}

}
