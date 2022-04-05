package com.registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.shine.com/myshine/login/");
		
		WebElement email=driver.findElement(By.cssSelector("#id_email_login"));
		email.sendKeys("chethan.15@gmail.com");
		
		
		WebElement pass=driver.findElement(By.cssSelector("#id_password"));
		pass.sendKeys("Chethan@123");
	
		
		WebElement button= driver.findElement(By.cssSelector("#loginButton"));
		//button.submit();
		
	}
}