package com.bank.generic.objectrepositryutility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {

	public AndroidDriver driver;

	public HomePage(AndroidDriver driver) {
		this.driver = driver;
//		PageFactory.initElements(driver, this);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").instance(24)")
	private WebElement btnHome;

	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").instance(25)")
	private WebElement btnOffers;

	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").instance(26)")
	private WebElement btnSmartQuotation;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"All Categories\"]")
	private WebElement btnAllCatagotiers;

	@AndroidFindBy(xpath = "//h2.o1/android.view.View/android.view.View/android.view.View/android.view.View[5]")
	private WebElement btnShopCart;

	@AndroidFindBy(xpath = "//h2.o1/android.view.View/android.view.View/android.view.View/android.view.View[6]")
	private WebElement btnProfile;

	public WebElement getBtnHome() {
		return btnHome;
	}

	public WebElement getBtnOffers() {
		return btnOffers;
	}

	public WebElement getBtnSmartQuotation() {
		return btnSmartQuotation;
	}

	public WebElement getBtnAllCatagotiers() {
		return btnAllCatagotiers;
	}

	public WebElement getBtnShopCart() {
		return btnShopCart;
	}

	public WebElement getBtnProfile() {
		return btnProfile;
	}

}
