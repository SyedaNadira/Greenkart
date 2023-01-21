package com.javaooppractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathPractice {


	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@id='headers5']"));
		//driver.findElement(By.xpath("//input[@id='bmwradio']")).click();
		//driver.findElement(By.xpath("(//*[@name='cars'])[3]")).click();
		//*[@*='value']
		//double slash(//) tag name[@attribute='value'] x path formula 
		//(//*[Contains(text(),'value')] Contain text formula
		//driver.findElement(By.xpath("(//*[contains(text(),'Web Table Example']"));
		//driver.findElement(By.xpath("//input[@id='benzradio']")).click();
		//driver.findElement(By.xpath("//select[@id='carselect']"))
		
		WebElement firstselect= driver.findElement(By.xpath("//select[@id='multiple-select-example']"));
		Select abc=new Select(firstselect);
		abc.selectByVisibleText("Apple");
		abc.selectByVisibleText("Orange");
				
	}

}
