package com.seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Java Software\\SeleniumJava\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.id("email")).sendKeys("greens001@gmail.com");
		
	}

}
