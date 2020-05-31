package testclasses;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseSuite;


public class Scenario1 extends BaseSuite {
	
  @Test(groups = {"main"})
  public void method1() throws InterruptedException {

	  System.out.println("Begin main scenario execution");
	  
	  System.out.println("opening browser...");	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("http://www.google.com");
	  System.out.println("Sleeping for 5 seconds...");
	  Thread.sleep(5000);
	  
	  System.out.println("Close browser session");
	  driver.close();
  }
}
