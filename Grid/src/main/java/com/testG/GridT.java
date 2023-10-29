package com.testG;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridT {

	public static void main(String[] args) throws MalformedURLException {
		 ChromeOptions chromeOptions = new ChromeOptions();
//       chromeOptions.setCapability("platformName", "Windows");
//       EdgeOptions edgeOptions = new EdgeOptions();
       
       chromeOptions.setCapability("se:name", "My simple test"); 
       
       URL URL = new URL("http://173.39.28.40:4444");
       WebDriver driver = new RemoteWebDriver(URL, chromeOptions);
       driver.get("http://www.google.com");
       
       List<WebElement> lstBtns = driver.findElements(By.xpath("//*[text()='No thanks']"));
       if (lstBtns.size()>0) {
           lstBtns.get(0).click();
           
       }
       
       
       driver.findElement(By.name("q")).sendKeys("Cisco");
       driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	}

}
