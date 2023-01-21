package com.loop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectionAndSingleSelection {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//select[@id='carselect']"));
		
		WebElement firstselect= driver.findElement(By.xpath("//select[@id='carselect']"));
		Select abc=new Select(firstselect);
		abc.selectByIndex(0);
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='multiple-select-example']"));
		Select abc1=new Select(dropdown);
		abc1.selectByValue("apple");
		abc1.selectByValue("orange");
	}

	
	}


