package com.Project.PageObjectModel;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	WebDriver ldriver;
	private By addproducttocart = By.className("NwyjNT");

	public ProductPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public void OpenNewTab() {
		List<String> handles = new ArrayList<>(ldriver.getWindowHandles());
		ldriver.switchTo().window(handles.get(handles.size() - 1));
	}
	
	public void CloseCurrentTabAndSwitchBack() {
		List<String> handles = new ArrayList<>(ldriver.getWindowHandles());
		ldriver.close();
		ldriver.switchTo().window(handles.get(0));
	}
	
	public void addProductToCart() {
		ldriver.findElement(addproducttocart).click();
		System.out.println("Product is Added into Cart..");
	}
}

