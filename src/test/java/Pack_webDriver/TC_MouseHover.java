package Pack_webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get(" https://snapdeal.com/");
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[@id=\"leftNavMenuRevamp\"]/div[1]/div[2]/ul/li[2]/a/span[2]"));
		
		driver.findElement(By.linkText("Sunglasses"));
		
		WebElement ele=driver.findElement(By.linkText("Sunglasses"));
		
		Actions act=new Actions(driver);
		act.moveToElement(ele).build().perform();
		

	}

}
