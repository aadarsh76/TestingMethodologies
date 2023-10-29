package com.chappal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;





public class BakalStreet {

@FindBy(xpath = "//input[@type='submit']")
private  WebElement xpathName;


public BakalStreet(WebDriver driver) {
	PageFactory.initElements(driver, this);

}

public void click1() {
	xpathName.click();
}
    


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    WebDriver driver=new EdgeDriver();
//	    https://www.ebay.nl/
	    driver.get("https://www.ebay.nl/");
	    driver.findElement(By.xpath("//*[@id='gh-ac']"));
	   
//		WebElement Prop = driver.findElement(By.xpath("//*[@id='gh-ac']"));
		 
//		Prop.sendKeys("Saree");
	    
	    
		try {
			
		
		//WebElement SearchB = driver.findElement(By.xpath("//input[@type='submit']"));
		driver.navigate().refresh();
		System.out.println("soemthing");
		try {
			try {
				try {
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		catch(Exception ex) {
 ex.printStackTrace();
 ex.getMessage();
		}
//		("//input[@type='submit']");
	    
	    
	

	}
}

