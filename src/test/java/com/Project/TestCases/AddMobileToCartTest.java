package com.Project.TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Project.PageObjectModel.CartPage;
import com.Project.PageObjectModel.HomePage;
import com.Project.PageObjectModel.ProductPage;
import com.Project.PageObjectModel.SearchResultsPage;
import com.aventstack.extentreports.Status;

public class AddMobileToCartTest extends Base_Class {

	@Test(priority=1,alwaysRun=true)
	public void TestCase1() throws InterruptedException {
		test = extent.createTest("TestCase1: Search Mobile");
		test.log(Status.INFO, "Browser Opens Successfully");
		logger.info("Browser Opens Sucessfully");
		Reporter.log("Flipkart Opens..");
		logger.info("Flipkart Opens");
		test.log(Status.INFO, "FlipKart Opens Successfully");
		HomePage homepage=new HomePage(driver);
		homepage.searchProduct("Smart Phone");
		Reporter.log("Smart Phone Searched...");
		logger.info("Smart Phone Searched");
		test.log(Status.INFO, "Smart Phone Searched");
		Thread.sleep(3000);
	}

	@Test(priority=2, dependsOnMethods="TestCase1",alwaysRun=true)
	public void TestCase2() throws InterruptedException {
		test = extent.createTest("TestCase2: Select Mobile");
		Reporter.log("Switching to Search Results Page of Mobile is Done...");
		logger.info("Switching to Search Results Page of Mobile is Done");
		test.log(Status.INFO, "Switched To Search Results Page of Mobile");
		SearchResultsPage searchresultpage=new SearchResultsPage(driver);
		searchresultpage.BrandFiltermobile();
		Reporter.log("Selecting a Mobile of Particular Brand is Done...");
		logger.info("Selecting a Mobile of Particular Brand is Done");
		test.log(Status.INFO, "Selected The Mobile of Particular Brand");
		searchresultpage.selectFirstProductmobile();
		Reporter.log("Selecting the Mobile is Done..");
		logger.info("Selecting the Mobile is Done");
		test.log(Status.INFO, "Mobile Brand Selected and Product Clicked");
		Thread.sleep(3000);
	}

	@Test(priority=3,dependsOnMethods="TestCase2",alwaysRun=true)
	public void TestCase3() throws InterruptedException {
		test = extent.createTest("TestCase3: Add Mobile to Cart");
		Reporter.log("Switching to Product Page of Mobile is Done...");
		logger.info("Switching to Product Page of Mobile is Done");
		test.log(Status.INFO, "Switched to Product Page of Mobile");
		ProductPage productpage=new ProductPage(driver);
		productpage.OpenNewTab();
		Reporter.log("New Tab Opens..");
		logger.info("New Tab Opens");
		productpage.addProductToCart();
		Reporter.log("Mobile is Added To Cart...");
		logger.info("Mobile is Added To Cart");
		Thread.sleep(3000);
		productpage.CloseCurrentTabAndSwitchBack();
		Reporter.log("Current Tab is Closed...");
		logger.info("Current Tab is Closed");
		test.log(Status.INFO, "Mobile Added to Cart");
		test.log(Status.INFO, "Switched Back to HomePage");
	}

	@Test(priority=4,dependsOnMethods="TestCase3",alwaysRun=true)
	public void TestCase4() throws InterruptedException {
		test = extent.createTest("TestCase4: Search Tablet");
		Reporter.log("Switched to Home Page...");
		logger.info("Switched to Home Page");
		HomePage homepage=new HomePage(driver);
		homepage.clearSearchBox();
		Reporter.log("Search Box is Cleared...");
		test.log(Status.INFO, "Search Box Cleared");
		logger.info("Search Box is Cleared");
		homepage.searchProduct("Tablet");
		Reporter.log("Tablet is Searched...");
		logger.info("Tablet is Searched");
		test.log(Status.INFO, "Tablet Searched");
		Thread.sleep(3000);
	}

	@Test(priority=5,dependsOnMethods="TestCase4",alwaysRun=true)
	public void TestCase5() throws InterruptedException {
		test = extent.createTest("TestCase5: Select Tablet");
		Reporter.log("Switching to Search Results Page of Tablet is Done...");
		logger.info("Switching to Search Results Page of Tablet is Done");
		test.log(Status.INFO, "Switched To Search Results Page of Tablet");
		SearchResultsPage searchresultpage=new SearchResultsPage(driver);
		searchresultpage.Brandfiltericontablet();
		Reporter.log("Different Brands of Tablet Appers...");
		test.log(Status.INFO, "Different Brands of Tablet Appears");
		logger.info("Different Brands of Tablet Appers");
		Thread.sleep(3000);
		searchresultpage.Brandfiltertablet();
		Reporter.log("Selecting a Tablet of Particular Brand is Done...");
		logger.info("Selecting a Tablet of Particular Brand is Done");
		test.log(Status.INFO, "Selected The Tablet of Particular Brand");
		Thread.sleep(3000);
		searchresultpage.selectsecondProducttablet();
		Reporter.log("Selecting the Tablet is Done..");
		logger.info("Selecting the Tablet is Done");
		test.log(Status.INFO, "Tablet Brand Selected and Product Clicked");
		Thread.sleep(3000);
	}

	@Test(priority=6,dependsOnMethods="TestCase5",alwaysRun=true)
	public void TestCase6() throws InterruptedException {
		test = extent.createTest("TestCase6: Add Tablet to Cart");
		Reporter.log("Switching to Product Page of Tablet is Done...");
		logger.info("Switching to Product Page of Tablet is Done");
		test.log(Status.INFO, "Switched to Product Page of Tablet");
		ProductPage productpage=new ProductPage(driver);
		productpage.OpenNewTab();
		Reporter.log("New Tab Opens..");
		logger.info("New Tab Opens");
		productpage.addProductToCart();
		Reporter.log("Tablet is Added To Cart...");
		logger.info("Tablet is Added To Cart");
		Thread.sleep(3000);
		productpage.CloseCurrentTabAndSwitchBack();
		Reporter.log("Current Tab is Closed...");
		logger.info("Current Tab is Closed");
		test.log(Status.INFO, "Tablet Added to Cart");
		test.log(Status.INFO, "Switched back to Homepage");
	}

	@Test(priority=7,dependsOnMethods="TestCase6",alwaysRun=true)
	public void TestCase7() throws InterruptedException {
		test = extent.createTest("TestCase7: Search Laptop");
		Reporter.log("Switched to Home Page...");
		logger.info("Switched to Home Page");
		HomePage homepage=new HomePage(driver);
		homepage.clearSearchBox();
		Reporter.log("Search Box is Cleared...");
		logger.info("Search Box is Cleared");
		test.log(Status.INFO, "Search Box Cleared");
		homepage.searchProduct("Laptop");
		Reporter.log("Laptop is Searched...");
		logger.info("Laptop is Searched");
		test.log(Status.INFO, "Laptop Searched");
		Thread.sleep(3000);
	}

	@Test(priority=8,dependsOnMethods="TestCase7",alwaysRun=true)
	public void TestCase8() throws InterruptedException {
		test = extent.createTest("TestCase8: Select Laptop");
		Reporter.log("Switching to Search Results Page of Laptop is Done...");
		logger.info("Switching to Search Results Page of Laptop is Done");
		test.log(Status.INFO, "Switched To Search Results Page of Laptop");
		SearchResultsPage searchresultpage=new SearchResultsPage(driver);
		searchresultpage.BrandFiltericonlaptop();
		Reporter.log("Different Brands of Laptop Appers...");
		test.log(Status.INFO, "Different Brands of Laptop Appears");
		logger.info("Different Brands of Laptop Appers");
		Thread.sleep(3000);
		searchresultpage.Brandfilterlaptop();
		Reporter.log("Selecting a Laptop of Particular Brand is Done...");
		logger.info("Selecting a Laptop of Particular Brand is Done");
		test.log(Status.INFO, "Selected The Laptop of Particular Brand");
		Thread.sleep(3000);
		searchresultpage.selectthirdproductlaptop();
		Reporter.log("Selecting the Laptop is Done..");
		logger.info("Selecting the Laptop is Done");
		test.log(Status.INFO, "Laptop Brand Selected and Product Clicked");
		Thread.sleep(3000);
	}

	@Test(priority=9,dependsOnMethods="TestCase8",alwaysRun=true)
	public void TestCase9() throws InterruptedException {
		test = extent.createTest("TestCase9: Add Laptop to Cart");
		Reporter.log("Switching to Product Page of Laptop is Done...");
		logger.info("Switching to Product Page of Laptop is Done");
		test.log(Status.INFO, "Switched to Product Page of Laptop");
		ProductPage productpage=new ProductPage(driver);
		productpage.OpenNewTab();
		Reporter.log("New Tab Opens..");
		logger.info("New Tab Opens");
		productpage.addProductToCart();
		Reporter.log("Laptop is Added To Cart...");
		logger.info("Laptop is Added To Cart");
		Thread.sleep(3000);
		productpage.CloseCurrentTabAndSwitchBack();
		Reporter.log("Current Tab is Closed...");
		logger.info("Current Tab is Closed");
		test.log(Status.INFO, "Laptop is Added to Cart");
		test.log(Status.INFO, "Switched Back to Homepage");
	}

	@Test(priority=10,dependsOnMethods="TestCase9",alwaysRun=true)
	public void TestCase10() throws InterruptedException {
		test = extent.createTest("TestCase10: Verify Cart Items");
		Reporter.log("Cart Page Appears...");
		logger.info("Cart Page Appears");
		test.log(Status.INFO, "Clicked on CartPage");
		CartPage cartpage = new CartPage(driver);
		cartpage.OpenCart();
		test.log(Status.INFO, "Opened Cart Page");
		Thread.sleep(3000);

		try {
			Assert.assertTrue(cartpage.isProductPresentinCart(cartpage.Mobile, "Apple iPhone 13 (Starlight, 128 GB)"), "Mobile Not Found in Cart");
			test.log(Status.PASS, "Mobile Verified in Cart");
		} catch (AssertionError e) {
			test.log(Status.FAIL, "Mobile Not Found in Cart");
			throw e;
		}
		Thread.sleep(3000);
		try {
			Assert.assertTrue(cartpage.isProductPresentinCart(cartpage.Tablet, "POCO Pad 5G 8 GB RAM 256 GB ROM 12.1 inch with Wi-Fi+5G Tablet (Cobalt Blue)"), "Tablet Not Found in Cart");
			test.log(Status.PASS, "Tablet Verified in Cart");
		} catch (AssertionError e) {
			test.log(Status.FAIL, "Tablet Not Found in Cart");
			throw e;
		}
		Thread.sleep(3000);
		try {
			Assert.assertTrue(cartpage.isProductPresentinCart(cartpage.Laptop, "MSI Modern 15 H AI Intel Core Ultra 5 125H - (16 GB/512 GB SSD/Windows 11 Home)"), "Laptop Not Found in Cart");
			test.log(Status.PASS, "Laptop Verified in Cart");
		} catch (AssertionError e) {
			test.log(Status.FAIL, "Laptop Not Found in Cart");
			throw e;
		}
		test.log(Status.INFO, "All Products Verified in Cart");
		logger.info("All The Products Verified");
		Reporter.log("All The Products Verified...");
		logger.info("Browser Closed Successfully");
	}
}
