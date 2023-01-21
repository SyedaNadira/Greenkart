package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YouTubePages {
	public YouTubePages(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
 
@FindBy(xpath="//input[@name='identifier']")
private WebElement email;

@FindBy(xpath="//*[contains(text(),'Next')]")
private WebElement next;

@FindBy(xpath="//*[@class='WpHeLc VfPpkd-mRLv6 VfPpkd-RLmnJb']")
private WebElement tryagain;

public WebElement getEmail() {
	return email;
}

public WebElement getNext() {
	return next;
}

public WebElement getTryagain() {
	return tryagain;
}



}

