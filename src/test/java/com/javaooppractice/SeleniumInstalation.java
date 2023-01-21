package com.javaooppractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumInstalation {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		//driver.close();
		//driver.findElement(By.xpath("//*[@aria-label='Search']"))
		
		 WebElement search = driver.findElement(By.xpath("//*[@aria-label='Search']"));
		 search.sendKeys("iphone 14 promax");
		 search.sendKeys(Keys.ENTER);
		
		//driver.findElement(By.className("nav-search-bar-form")).sendKeys("Books");
		//driver.findElement(By.name("isscrid")).sendKeys("Toys");
		
		
	}
}



