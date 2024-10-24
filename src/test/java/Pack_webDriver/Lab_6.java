package Pack_webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;
import io.github.bonigarcia.wdm.WebDriverManager;
 
import java.time.Duration;
 
public class Lab_6 {
    public static void main(String[] args) {
        // Set up ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 
        // Open Meesho website
        driver.get("https://www.meesho.com/");
        driver.manage().window().maximize();
 
        // Explicit wait initialization
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
 
        try {
            // Locate search box
            WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Try Saree, Kurti or Search by Product Code']"));
            searchBox.sendKeys("Saree");
            searchBox.sendKeys(Keys.RETURN);
 
            // Wait for the product results to load
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@href, 'saree')]")));
 
            // Scroll the element into view before interacting with it
            boolean clicked = false;
            int attempts = 0;
 
            while (!clicked && attempts < 3) {  // Retry up to 3 times
                try {
                    // Locate the first product again to avoid stale element exception
                    WebElement firstProduct = driver.findElement(By.xpath("//a[contains(@href, 'saree')]"));
 
                    // Scroll the element into view using JavaScript
                    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", firstProduct);
 
                    // Wait for the element to be clickable
                    wait.until(ExpectedConditions.elementToBeClickable(firstProduct));
 
                    // Click the product
                    firstProduct.click();
                    clicked = true;
                } catch (org.openqa.selenium.StaleElementReferenceException | org.openqa.selenium.ElementNotInteractableException e) {
                    System.out.println(e.getClass().getSimpleName() + " caught, retrying...");
                    attempts++;
                    Thread.sleep(1000);  // Pause for a moment before retrying
                }
            }
 
            if (!clicked) {
                throw new Exception("Failed to click product after multiple attempts.");
            }
 
            // Wait for the product page to load
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Add to Cart']")));
 
            // Click 'Add to Cart' button
            WebElement addToCartButton = driver.findElement(By.xpath("//button[text()='Add to Cart']"));
            addToCartButton.click();
 
            // Verify the product is added to cart
            WebElement successMessage = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(), 'added to cart')]")));
            if (successMessage.getText().contains("added to cart")) {
                System.out.println("Product successfully added to cart.");
            }
 
            // Proceed to checkout
            WebElement checkoutButton = driver.findElement(By.xpath("//button[text()='Checkout']"));
            checkoutButton.click();
 
            // Log out from the account (if logged in)
            try {
                WebElement accountDropdown = driver.findElement(By.xpath("//div[@class='account-dropdown']"));
                accountDropdown.click();
                WebElement logoutButton = driver.findElement(By.xpath("//a[text()='Logout']"));
                logoutButton.click();
                System.out.println("Logged out successfully.");
            } catch (Exception e) {
                System.out.println("Logout not required or user not logged in.");
            }
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}