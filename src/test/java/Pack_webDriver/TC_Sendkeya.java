package Pack_webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Sendkeya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/en-gb?route=account/register");
		
		driver.findElement(By.id("input-firstname")).sendKeys("Swetha");
		
		driver.findElement(By.id("input-firstname")).sendKeys(Keys.TAB);
		
		driver.findElement(By.id("input-lastname")).sendKeys("Keys.NUMPAD7");
		
		
		javascriptExecutor js
		
		WebElement subscribe=driver.findElement(By.id("input-newsletter"));
		
		subscribe.click();
		
		if(subscribe.isSelected())
		{
			System.out.println("subscribed");
		}
		else
			System.out.println("Not subscribed");
		
		driver.close();
		
		
	  
		
	}
	
	
}
		