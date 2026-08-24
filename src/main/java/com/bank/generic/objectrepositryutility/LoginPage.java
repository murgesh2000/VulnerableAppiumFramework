package com.bank.generic.objectrepositryutility;

import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage {

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Okay\"]")
	private WebElement txtWarning;
	
	

}
