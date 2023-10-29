package com.playy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;

public class TaskT {
    public static void main(String[] args) {
	 WebDriver driver = new EdgeDriver();
     String url = "https://www.amazon.in/";
     driver.get(url);
//     try {
     driver.findElement(By.xpath("//*[@data-csa-c-slot-id='nav_cs_3']")).click();
//     }
//     catch(Exception e) {
//         System.out.println("mobile popup not found");
//        try {
     driver.findElement(By.xpath("//*[@class=\"a-dynamic-image sl-sobe-carousel-sub-card-img\"]")).click();
//         }
//         catch(Exception p) {
//             System.out.println("data not found");
//             try {
             driver.findElement(By.xpath("//*[@formaction=\"/cart/add-to-cart/ref=dp_start-bbf_1_glance\"]")).click();
//             }
//             catch(Exception d) {
//                 System.out.print("Cart button missing");
//             }
//             
         }
     }
}
}








