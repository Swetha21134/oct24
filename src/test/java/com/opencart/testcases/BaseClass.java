package com.opencart.testcases;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
 
import com.opencart.utilities.Readconfig;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class BaseClass {

	WebDriver driver;

	public BaseClass(WebDriver driver) {

		this.driver=driver;

	}

	public void setup(String url) {

		Readconfig con=new Readconfig();

		String BN=con.getproperties();


		switch (BN) {

		case "chrome":

			WebDriverManager.chromedriver().setup();

			driver=new ChromeDriver();

			driver.get(url);

		case "edge":

			WebDriverManager.edgedriver().setup();

			driver=new EdgeDriver();

			driver.get(url);

		case "firefox":

			WebDriverManager.firefoxdriver().setup();

			driver=new FirefoxDriver();

			driver.get(url);

		}

		WebDriverManager.chromedriver().setup();

		driver.new chromedriver();

		driver.get(url);

	}

	public void teardown(){

		driver.quit();

	}
 
	}
 