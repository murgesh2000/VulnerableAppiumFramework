package com.bank.testScript;

import org.testng.annotations.Test;

import com.bank.basetest.BaseClass;
import com.bank.generic.gesturesutility.GestureUtility;
import com.bank.generic.objectrepositryutility.HomePage;

public class HomePageTest extends BaseClass {
	GestureUtility gestureUtil = new GestureUtility(driver);

	@Test
	public void HomePageFunctionalityTest() {

		HomePage hp = new HomePage(driver);
		hp.getBtnAllCatagotiers().click();

//		gestureUtil.clickByElements(hp.getBtnAllCatagotiers());

	}

}
