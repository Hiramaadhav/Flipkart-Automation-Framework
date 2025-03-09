package com.Project.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver ldriver;
	private By searchBox = By.name("q");

	public HomePage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public void searchProduct(String productName) {
		ldriver.findElement(searchBox).sendKeys(productName);
		ldriver.findElement(searchBox).submit();
	}
	
	public void clearSearchBox() {
	    WebElement searchField = ldriver.findElement(searchBox);
	    searchField.sendKeys(Keys.CONTROL + "a"); 
	    searchField.sendKeys(Keys.BACK_SPACE);    
	}
}
