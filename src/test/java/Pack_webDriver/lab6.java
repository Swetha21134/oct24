package Pack_webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lab6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/en-gb?route=account/account&customer_token=d15a6a32abde1661890d90e6cc");
		
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Components")).click();
		driver.findElement(By.linkText("Monitors (2)")).click();
		
		WebElement showDropdown = driver.findElement(By.id("input-limit"));
		Select showSelect=new Select(showDropdown);
		showSelect.selectByIndex(1);
		
		
	}

	
	}


