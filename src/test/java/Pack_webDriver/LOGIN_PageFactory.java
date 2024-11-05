package Pack_webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LOGIN_PageFactory {
	
	@FindBy(id= "input-email")
	WebElement username;
	
	@FindBy(id= "input-password")
	WebElement userpassword;
	
	@FindBy(id= "//button[@type='submit']")
	WebElement loginbutton;
	
private WebDriver driver;


public LOGIN_PageFactory(WebDriver driver) {
	this.driver=driver;
}

void enterusername(String email)
{
	username.sendKeys(email);
}
void enteruserpassword(String password)
{
	userpassword.sendKeys(password);
}
void clickloginbutton()
{
	loginbutton.click();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
