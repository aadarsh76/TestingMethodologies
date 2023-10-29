package com.test;

import org.testng.annotations.Test;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="features",
		glue= {},
		tags="@Sample"
		)

public class CucuPt {
  @Test
  public void f() {
  }
}
