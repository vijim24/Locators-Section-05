package com.viji;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators03 {

	public static void main(String[] args) {
// 	Sibling - Child to parent Transfer
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32_113\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//div/button[1]/following-sibling::button[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//div/button[1]/parent::div")).getText());
	}

}
