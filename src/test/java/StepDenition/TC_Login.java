package StepDenition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class TC_Login {
	
	WebDriver driver;
	@Given("Launch the browser")
	public void launch_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
 
	@And("Navigate to the URL")
	public void navigate_to_the_url() {
		driver.get("https://demo.opencart.com/en-gb?route=account/login");
	}
 
	@When("Enter the valid username and password")
	public void enter_the_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("input-email")).sendKeys("katapallysruthi@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Sruthi21");
	   
	}
 
	@And("click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
 
	@Then("login should be successful")
	public void login_should_be_successful() {
		if(driver.findElement(By.linkText("Logout")).isDisplayed())
		{
			System.out.println("Login Successful");
		}
		else
		{
			if(driver.findElement(By.linkText("Logout")).isDisplayed())
			{
				System.out.println("Login unsuccessful");
			}
		}
	}
 
	@When("Enter the invalid username and password")
	public void enter_the_invalid_username_and_password() {
		driver.findElement(By.id("input-email")).sendKeys("ttttttttt@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("welcome");
	    
	}
 
	@Then("verify the login")
	public void login_should_be_unsuccessful() {
	    try
	    {
	    	if(driver.findElement(By.linkText("Logout")).isDisplayed())
			{
				System.out.println("Login Successful");
			}
			else
			{
				if(driver.findElement(By.linkText("Logout")).isDisplayed())
				{
					System.out.println("Login unsuccessful");
				}
			}
	    }
	    	catch(Exception e) {
	    		System.out.println(e);
	    	}
	    
}
