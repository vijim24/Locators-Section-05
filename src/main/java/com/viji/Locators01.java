package com.viji;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators01 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Tools\\\\chromedriver_win32_113\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
//		Implicit WAIT
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//		Locators
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.cssSelector("button[class='submit signInBtn']")).click();
		System.out.println(driver.findElement(By.cssSelector("form[class='form'] p")).getText()); 
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//form/input[1]")).sendKeys("abc");
		driver.findElement(By.xpath("//div[@class='form-container sign-up-container']/form/input[2]")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("987654321");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[class*='pwd']")).click();
		System.out.println(driver.findElement(By.className("infoMsg")).getText()); 
		driver.findElement(By.xpath("//button[contains(@class,'login')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@value='rmbrUsername']")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("signInBtn")).click();
	}

}
