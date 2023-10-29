package com.testG;

	import org.testng.annotations.Test;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Listeners;

	import static org.testng.Assert.assertEquals;

	import org.testng.annotations.AfterClass;

	@Listeners(Listener.class)
	
	public class TestListener {
	  @Test
	  public void test1() {
	  }
	  @Test
	  public void test2() {
	      assertEquals(10, 11);
	  }
	  

	  
	  @BeforeClass
	  public void beforeClass() {
	  }

	  @AfterClass
	  public void afterClass() {
	  }

	}

}
