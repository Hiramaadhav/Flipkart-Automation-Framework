package com.Project.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage {
	WebDriver ldriver;
	private By brandfiltermobile=By.xpath("//div[contains(text(),'Apple')]");
	private By productLinkmobile = By.xpath("//div[normalize-space()='Apple iPhone 13 (Starlight, 128 GB)']");
	private By PriceMobile=By.cssSelector("body > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)");

	private By brandfiltertableticon=By.xpath("//div[@class='fxf7w6 rgHxCQ'][normalize-space()='Brand']");
	private By brandfiltertablet=By.xpath("//div[contains(text(),'POCO')]");
	private By productLinktablet=By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[2]/div[1]/div[1]");
	private By PriceTablet=By.cssSelector("body > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)");

	private By brnadfilterlaptopicon=By.xpath("//div[@class='fxf7w6 rgHxCQ'][normalize-space()='Brand']");
	private By brandfilterlaptop=By.xpath("//div[contains(text(),'MSI')]");
	private By productLinklaptop=By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[2]/div[1]/div[2]");
	private By PriceLaptop=By.cssSelector("body > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)");

	public SearchResultsPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public void BrandFiltermobile() {
		ldriver.findElement(brandfiltermobile).click();
		WebElement MobileBrand=ldriver.findElement(brandfiltermobile);
		WebElement MobilePrice=ldriver.findElement(PriceMobile);
		System.out.println("Mobile Brand: " + MobileBrand.getText());
		System.out.println("Price of Mobile: " + MobilePrice.getText());
	}

	public void selectFirstProductmobile() {
		ldriver.findElement(productLinkmobile).click();
		WebElement MobileLink=ldriver.findElement(productLinkmobile);
		System.out.println("Mobile Name: " + MobileLink.getText());
	}

	public void Brandfiltericontablet() {
		ldriver.findElement(brandfiltertableticon).click();
	}

	public void Brandfiltertablet() {
		ldriver.findElement(brandfiltertablet).click();
		WebElement TabletBrand=ldriver.findElement(brandfiltertablet);
		WebElement TabletPrice=ldriver.findElement(PriceTablet);
		System.out.println("Tablet Brand: " + TabletBrand.getText());
		System.out.println("Price of Tablet: " + TabletPrice.getText());
	}

	public void selectsecondProducttablet() {
		ldriver.findElement(productLinktablet).click();
		WebElement TabletLink=ldriver.findElement(productLinktablet);
		System.out.println("Tablet Name: " + TabletLink.getText());
	}

	public void BrandFiltericonlaptop(){
		ldriver.findElement(brnadfilterlaptopicon).click();
	}

	public void Brandfilterlaptop() {
		ldriver.findElement(brandfilterlaptop).click();
		WebElement LaptopBrand=ldriver.findElement(brandfilterlaptop);
		WebElement LaptopPrice=ldriver.findElement(PriceLaptop);
		System.out.println("Laptop Brand: " + LaptopBrand.getText());
		System.out.println("Price of Laptop: " + LaptopPrice.getText());
	}

	public void selectthirdproductlaptop() {
		ldriver.findElement(productLinklaptop).click();
		WebElement LaptopLink=ldriver.findElement(productLinklaptop);
		System.out.println("Laptop Name: " + LaptopLink.getText());
	}
}
