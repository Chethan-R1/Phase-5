package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://nxtgenaiacademy.com/alertandpopup/");
        
        WebElement button1= driver.findElement(By.name("alertbox"));
        button1.click();
        
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        
        WebElement button2= driver.findElement(By.name("confirmalertbox"));
        button2.click();
        
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
	}

}
