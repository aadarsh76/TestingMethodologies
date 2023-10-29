package ReportScreenshots;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;


@Listeners(ListenerC.class)
public class NewTest extends BaseS {
	
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("initialising");
	  initialization();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
//	  onQuit();
  }
  @Test
  public void test1() {
	  System.out.println("got failed");
	  Assert.assertEquals(false,true);
  }

}
