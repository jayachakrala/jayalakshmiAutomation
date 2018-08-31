package com.genericfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Genericmethods {
	public static WebDriver driver;
	public static Actions acc;
	public static WebElement ele;
	public static boolean status;

	public static boolean launchBrowser(String browsertype, String url) {

		try {
			status = true;
			switch (browsertype.toLowerCase()) {

			case "ff":
				driver = new FirefoxDriver();

				driver.get(url);

				break;

			}

		}

		catch (Exception e) {
			status = false;
			System.out.println(e.getMessage());

		}

		return status;

	}

	public static boolean clickandclear(WebElement ele, String data) {

		try {
			status = true;

			ele.click();
			ele.clear();

			ele.sendKeys(data);

		} catch (Exception e) {
			status = false;
			System.out.println(e.getMessage());
			System.out.println("unable to enter data into the field" + ele);

		}
		return status;

	}

	public static boolean mousehover(WebElement element) {

		try {

			acc = new Actions(driver);
			acc.moveToElement(element).click().build().perform();
			status = true;

		} catch (Exception e) {
			status = false;

		}
		return status;
	}

	/*
	 * Method Name : clickButton
	 * 
	 * Description : Click the element in WebApplication
	 * 
	 * Input : Webelement
	 * 
	 * Output : True/False
	 * 
	 * Author:
	 * 
	 * Organa
	 */
	public static boolean clickButton(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Unable to click");
		}
		return status;
	}

	public static boolean elementDisplay(WebElement element) {
		try {
			element.isDisplayed();
			System.out.println("element  is displayed");
			status = true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Element is not displayed");
			status = false;
		}
		return status;

	}
}
