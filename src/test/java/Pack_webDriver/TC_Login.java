package Pack_webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		Thread.sleep(10000);
		driver.manage().window().minimize();
		//driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.x
		driver.findElement(By.linkText("Login")).click();

	}

}
