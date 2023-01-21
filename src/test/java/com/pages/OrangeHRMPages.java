package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMPages {

	public OrangeHRMPages(WebDriver driver) {
	PageFactory.initElements(driver,this);	
	}
	
public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}

@FindBy(xpath="//*[@name='username']")
private WebElement username;
@FindBy(xpath="//*[@name='password']")
private WebElement password;
@FindBy(xpath="//button[@type='submit']")
private WebElement login;
	}


