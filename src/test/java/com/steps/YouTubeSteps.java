package com.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.YouTubePages;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class YouTubeSteps {
	
	WebDriver driver;
	YouTubePages pf;
	@Given("^User go to Youtube Sign in page$")
	public void user_go_to_Youtube_Sign_in_page() throws Throwable {
		driver=new ChromeDriver();
		   driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=youtube&uilel=3&passive=true&continue=https%3A%2F%2Fwww.youtube.com%2Fsignin%3Faction_handle_signin%3Dtrue%26app%3Ddesktop%26hl%3Den%26next%3Dhttps%253A%252F%252Fwww.youtube.com%252F&hl=en&ec=65620&ifkv=AeAAQh5RI3HygqPno1ZkVDjR9TSerbeMEyr3FK0hZQIj2MyMQy5EZ-k9TN-np1hCp2OjOplsUkmu_A&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		   driver.manage().window().maximize();
		   Thread.sleep(3000);
		   pf=new YouTubePages(driver);
	    
	}

	@When("^User type the Email or phone$")
	public void user_type_the_Email_or_phone() throws Throwable {
		//driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("syedanadiras247");
	    Thread.sleep(3000);
	    pf.getEmail().sendKeys("syedanadiras247");
	     
	    
	}

	@Then("^User click on the next button$")
	public void user_click_on_the_next_button() throws Throwable {
		//driver.findElement(By.xpath("//*[contains(text(),'Next')]")).click(); 
		Thread.sleep(3000); 
		pf.getNext().click();
	    
	}

	@Then("^User click on the try again button$")
	public void user_click_on_the_try_again_button() throws Throwable {
		//driver.findElement(By.xpath("//*[@class='WpHeLc VfPpkd-mRLv6 VfPpkd-RLmnJb']")).click();
				Thread.sleep(2000);
			   pf.getTryagain().click();
	    
	}

}
