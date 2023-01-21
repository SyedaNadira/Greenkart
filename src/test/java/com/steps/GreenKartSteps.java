package com.steps;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.util.Helper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GreenKartSteps {
	WebDriver driver;
	List<Integer>prices=new ArrayList<>();
	int secondVal;
	int thirdVal;
	int totalVal;
	@Given("^go to GreenKart home page$")
	public void go_to_GreenKart_home_page() throws Throwable {
	    driver =new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	}

	@Given("^user verify the page title$")
	public void user_verify_the_page_title() throws Throwable {
	    
	    String expected="GreenKart - veg and fruits kart";
	    String actual=driver.getTitle();// use this method to verify the title.
	    System.out.println(actual);
	    Assert.assertEquals(expected,actual);
	   
	}

	@When("^user capture the all items from the page$")
	public void user_capture_the_all_items_from_the_page() throws Throwable {
		Helper.jSscrollBy(driver);
	    List<WebElement>items=driver.findElements(By.xpath("//p[@class='product-price']"));
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='product-price']")));
	    for(int i=0;i<items.size();i++) {
	    	String price=items.get(i).getText().trim();
	    	int priceInt=Integer.parseInt(price);
	    	prices.add(priceInt);
	    	
	    }
	    System.out.println(prices);
	}

	@When("^print sorted price in decending order$")
	public void print_sorted_price_in_decending_order() throws Throwable {
	    Collections.sort(prices,Collections.reverseOrder());
	    System.out.println(prices);
	    
	    
	}

	@When("^add secend and third items into cart$")
	public void add_secend_and_third_items_into_cart() throws Throwable {
	   secondVal=prices.get(1);
	    thirdVal=prices.get(2);
	    driver.findElement(By.xpath("//p[contains(text(),'"+secondVal+"')]/following-sibling::div[2]")).click();
	    driver.findElement(By.xpath("//p[contains(text(),'"+thirdVal+"')]/following-sibling::div[2]")).click();
	    totalVal=secondVal+thirdVal;
	    System.out.println("totalValue of second&third :- "+totalVal);
	    
	    		
	    
	}

	@Then("^user go to cart page$")
	public void user_go_to_cart_page() throws Throwable {
	driver.findElement(By.xpath("//img[@alt='Cart']")).click();
	    
	}

	@Then("^user varify total price$")
	public void user_varify_total_price() throws Throwable {
	    driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
	    Assert.assertEquals(totalVal,850);
	    
	}

	@Then("^user go to next page to select country \"([^\"]*)\"$")
	public void user_go_to_next_page_to_select_country(String arg1) throws Throwable {
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[text()='Place Order']")).click();
	    WebElement element =driver.findElement(By.xpath("//div[@class='wrapperTwo']//div//select"));
	    Select select=new Select(element);
	    select.selectByVisibleText(arg1);
	    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	    driver.findElement(By.xpath("//button[text()='Proceed']")).click();
	    
	}

	@Then("^user verify successfully shipped items$")
	public void user_verify_successfully_shipped_items() throws Throwable {
	    String message="Thank you, your order has been placed successfully";
	    Assert.assertEquals(message,"Thank you, your order has been placed successfully");
	    System.out.println("Thank you, your order has been placed successfully");
	    driver.quit();
	    
	}


}
