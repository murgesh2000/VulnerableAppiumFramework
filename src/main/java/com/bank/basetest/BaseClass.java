package com.bank.basetest;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.bank.generic.androidutility.AndroidUtility;
import com.bank.generic.fileutility.FileUtility;
import com.bank.generic.gesturesutility.GestureUtility;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseClass {

	public AppiumDriverLocalService service;
	public AndroidDriver driver;
	static public AndroidDriver sdriver;
	public AndroidUtility andUtil;
	public GestureUtility gUtil;
	public FileUtility fUtil = new FileUtility();

	@BeforeSuite(alwaysRun = true)
	public void startServer() {

		File f = new File("C:\\Users\\User\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		service = new AppiumServiceBuilder().withAppiumJS(f).withIPAddress("127.0.0.1").usingPort(4723)
				.withTimeout(Duration.ofSeconds(300)).build();

		service.start();
	}

	@BeforeClass(alwaysRun = true)
	public void launchApp(String deviceName, String UDID, int port) throws IOException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", fUtil.dataFromPropertiesFile("platformName"));
		dc.setCapability("automationName", fUtil.dataFromPropertiesFile("automationName"));
		dc.setCapability("deviceName", fUtil.dataFromPropertiesFile("deviceName"));
		dc.setCapability("Udid", fUtil.dataFromPropertiesFile("udid"));

		dc.setCapability("appPackage", fUtil.dataFromPropertiesFile("appPackage"));
		dc.setCapability("appActivity", fUtil.dataFromPropertiesFile("appActivity"));

		URL url = new URL("http://localhost:4723");

		driver = new AndroidDriver(url, dc);
		sdriver = driver;

		UiAutomator2Options op = new UiAutomator2Options();
	}

	@AfterSuite(alwaysRun = true)
	public void stopServer() {
		service.stop();
	}

}
