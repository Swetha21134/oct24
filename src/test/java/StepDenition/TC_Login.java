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
	@Given("launch the browser")
	public void launch_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
	}
 
	@Given("Navigate to the URL")
	public void navigate_to_the_url() {
		driver.get("https://www.saucedemo.com/");
	}
 
	@When("Enter the valid username and password")
	public void enter_the_valid_username_and_password() throws InterruptedException {
		  driver.findElement(By.id("user-name")).sendKeys("standard_user");
	        Thread.sleep(1000);
	        driver.findElement(By.id("password")).sendKeys("secret_sauce");
	        Thread.sleep(1000);
 
	}
 
	@When("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.id("login-button")).click();
	}
 
	@Then("verify the login")
	public void verify_the_login() {
		// Verification logic
        if (!driver.findElements(By.xpath("//*[@id='header_container']/div[2]/span")).isEmpty()
&& driver.findElement(By.xpath("//*[@id='header_container']/div[2]/span")).getText().equals("Products")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
    }
	
 
	@Then("Close")
	public void close() {
		driver.quit();
	}
 
	@When("Enter the invalid username and password")
	public void enter_the_invalid_username_and_password() throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys("invalid_user");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("invalid_password");
        Thread.sleep(1000);
	}
 
	@When("Click on login utton")
	public void click_on_login_utton() {
		driver.findElement(By.id("login-button")).click();
	}
 
	@Then("login should be unsuccessful")
	public void login_should_be_unsuccessful() {
		// Verification logic
        if (!driver.findElements(By.xpath("//*[@id='header_container']/div[2]/span")).isEmpty()
&& driver.findElement(By.xpath("//*[@id='header_container']/div[2]/span")).getText().equals("Products")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
	}
 
 
}