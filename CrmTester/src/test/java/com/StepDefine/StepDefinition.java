package com.StepDefine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	WebDriver driver=new EdgeDriver();

@Given("user is on login page")
public void user_is_on_login_page() {
	driver.get("https://classic.crmpro.com/index.html");
	String title=driver.getTitle();
	Assert.assertEquals("Free CRM  - CRM software for customer relationship management, sales, and support.",title);
}
@When("^user enters \"(.*)\" and \"(.*)\"$")
public void user_enters_username_and_password(String username, String password) {
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input")).click();
}
@Then("^$")
}
