package com.testingT;

import java.util.List;

//import com.chakku.EdgeDriver;
//import com.chakku.WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Saku {

	
	public static void main(String[] args) {		
    WebDriver driver = new EdgeDriver();
    driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();
    driver.findElement(By.linkText("Mobiles")).click();

    
      List<WebElement> listS = driver.findElements(By.xpath("//*[contains(text(),\"Starting\")]"));
      System.out.println(listS.size());
      
     
      
      for(WebElement rb : listS) {
//          System.out.println(((WebElement) rb).getText());
//          arr[i] = rb.gettext();
     
      
//      }    
       WebDriver[] arr = new WebElement[6];
          for(int i = 0 ; i < arr.length ; i++) {
              arr[i]  = listS.get(i);
              
          }
      
     for(int i=0;i<6;i++) {     
          System.out.println(arr[i].getText());
         
      
          
  }
     for(int i=0;i<6;i++) {     
//          System.out.println(arr[i].getText());
     
     String s1=arr[i].getText();
     String subst = s1.substring(10,s1.length());
     System.out.println(subst);
      
      }
      }
  
  }
}

  
//    List<WebElement> list_of_starting = driver.findElements(By.xpath("//*[Contains(text(),\"Starting\")]"));
//    System.out.println(list_of_starting.size());
//
//    // String[] arr = new String[6];
//    for (WebElement kd : list_of_starting) {
//        System.out.println(kd.getText());
//    }
//
//}
//
//}


