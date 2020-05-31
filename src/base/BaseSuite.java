package base;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseSuite {

  @BeforeClass(alwaysRun = true)
  public void beforeClass() {
	  System.out.println("BaseSuite => before each class");
  }

  @AfterClass(alwaysRun = true)
  public void afterClass() {
	  System.out.println("BaseSuite => after each class");
  }

  @BeforeSuite(alwaysRun = true)
  public void beforeSuite() {
	  System.out.println("BaseSuite => before suite");

  }

  @AfterSuite(alwaysRun = true)
  public void afterSuite() {
	  System.out.println("BaseSuite => after suite");
  }

}
