package com.Project.PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	WebDriver ldriver;
	private By WatchingCart = By.xpath("//span[normalize-space()='Cart']");
	public By Mobile=By.xpath("//a[normalize-space()='Apple iPhone 13 (Starlight, 128 GB)']");
	public By Tablet=By.xpath("//a[contains(text(),'POCO Pad 5G 8 GB RAM 256 GB ROM 12.1 inch with Wi-')]");
	public By Laptop = By.cssSelector("body > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > a:nth-child(1)");


	public CartPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public void OpenCart() {
		ldriver.findElement(WatchingCart).click();
		System.out.println("Navigated To Cart Page..");
	}

	public boolean isProductPresentinCart(By productLocator, String productName) {
		List <WebElement> Items=ldriver.findElements(productLocator);
		if(!Items.isEmpty()) {
			System.out.println("Product is Found in Cart:" + productName);
			return true;
		}else {
			System.out.println("Product is Not Found in Cart.." + productName);
			return false;
		}
	}

	public void VerifyCartItems() {
		OpenCart();

		boolean MobilePresent=isProductPresentinCart(Mobile,"Apple iPhone 13 (Starlight, 128 GB)");
		boolean TabletPresent=isProductPresentinCart(Tablet,"POCO Pad 5G 8 GB RAM 256 GB ROM 12.1 inch with Wi-Fi+5G Tablet (Cobalt Blue)");
		boolean LaptopPresent=isProductPresentinCart(Laptop,"MSI Modern 15 H AI Intel Core Ultra 5 125H - (16 GB/512 GB SSD/Windows 11 Home) Modern 15 H AI C1MG-04...");

		if(MobilePresent && TabletPresent && LaptopPresent) {
			System.out.println("All Products Are Added To Cart..");
		}
		else {
			System.out.println("Some Products Are Missing In Cart..");
		}
	}
}
