package Pack_webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LOGIN_POM {
	
	By username=By.id("input-email");
	By password=By.id("input-password");
	By loginbutton=By.xpath("//button[@type='submit']");
	private WebDriver driver;
	private By userpassword;
	
	
	
	
	public LOGIN_POM(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}




	void enterusername1(String email)
	{
		driver.findElement(username).sendKeys("email");
		
	}
	void enterusername(String password)
	{
		driver.findElement(userpassword).sendKeys("password");
		
	}
	
	
	void clickloginbutton()
	{
		driver.findElement(loginbutton).click();
	}




	public void enterpassword(String string) {
		// TODO Auto-generated method stub
		
	}




	

}
