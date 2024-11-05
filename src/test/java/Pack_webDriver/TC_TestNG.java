package Pack_webDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TC_TestNG {
	//private static final By By = null;
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String username, String password) throws InterruptedException {
	  System.out.println("This is the test");
	  
	  driver.findElement(By.id("input-email")).sendKeys(username);
	 	  driver.findElement(By.id("input-password")).sendKeys(password);
	  if(driver.findElement(By.xpath("//button[normalize-space()='Login']")).isDisplayed());
	  {
	  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	  
	  Assert.assertTrue(true) ;
  }
 
  
	  Thread.sleep(20000);
  }
  private Object id(String string) {
	// TODO Auto-generated method stub
	return null;
}
@BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/en-gb?route=account/login");
	  
	  System.out.println("This is the @BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is the @AfterMethod");
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	  driver.findElement(By.linkText("Logout")).click();
	  driver.quit();
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "yanalaswetha17@gmail.com","Welcome" },
      new Object[] {  "yanalaswetha17@gmail.com","Welcome" },
      new Object[] {  "yanalaswetha17@gmail.com","Welcome" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is the @BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is the @Afterclass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is the @Aftertest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is the @Aftertest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is the @BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is the @AfterSuite");
  }

}
