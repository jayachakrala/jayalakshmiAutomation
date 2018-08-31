package com.screenfunctions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.genericfunctions.Genericmethods;

public class Home_Page extends Genericmethods {

	@FindBy(how = How.XPATH, using = "//a[text()='Home']")
	public static WebElement Homepage;
	
	@FindBy(how = How.XPATH, using = "//div[@class='header']/img")
	public static WebElement logo;

	@FindBy(how = How.XPATH, using = "//span[@class='caption']")
	public static WebElement Securelogin;

	@FindBy(how = How.XPATH, using = "//input[@name='uname']")
	public static WebElement Username;

	@FindBy(how = How.XPATH, using = "//input[@name='pwd']")
	public static WebElement Password;

	@FindBy(how = How.XPATH, using = "//input[@name='submitBtn']")
	public static WebElement Login;

	@FindBy(how = How.XPATH, using = "//a[normalize-space(text())='Home']/parent::li/following-sibling::li/a")
	public static List<WebElement> alltabs;

	@FindBy(how = How.XPATH, using = "//a[text()='Admin ']")
	public static WebElement Admin;
	@FindBy(how = How.XPATH, using = "//a[text()='Staff ']")
	public static WebElement Staff;
	@FindBy(how = How.XPATH, using = "//a[text()='Features ']")
	public static WebElement Features;
	@FindBy(how = How.XPATH, using = "//a[text()='Contact Us']")
	public static WebElement Contactus;
	public static boolean status;

	public  boolean verifyLogo() {
		try {

			if (logo.isDisplayed()) {
				System.out.println("logo is displayed");
				status = true;

			}
		} catch (Exception e) {
			System.out.println(e);
			status = false;
			System.out.println("logo is not displayed");
		}

		return status;

	}

	public  boolean HomePageTabOrder() {
		List<String> tabs = new ArrayList<String>();
		try {

			for (int i = 0; i < alltabs.size(); i++) {
				tabs.add(alltabs.get(i).getText().trim());
			}
			String[] taborder = { "Admin", "Staff", "Features", "Contact Us" };
			for (int j = 0; j < taborder.length; j++) {
				if (tabs.get(j).equals(taborder[j])) {
					System.out.println(tabs.get(j) + " Tab order is as expected");
				} else {
					System.out.println(tabs.get(j) + " Tab order is not as expected");
				}
			}
			status = true;
		} catch (Exception e) {
			status = false;
			System.out.println(e.getMessage());
			System.out.println("unable to find the tabs");
		}
		return status;
	}

	public  boolean validateTabs() {

		try {
			for (int i = 0; i < alltabs.size(); i++) {
				String tabslabel = alltabs.get(i).getText().trim();
				System.out.println(tabslabel);
				
				switch (tabslabel) {
				case "Admin":
					elementDisplay(Admin);
					
					break;
				case "Staff":
					elementDisplay(Staff);
					break;
				case "Features":
					elementDisplay(Features);
					break;
				case "Contact Us":
					elementDisplay(Contactus);
					break;

				}
				System.out.println("tabs navigating as expected");
				
				alltabs.get(i).click();
				clickButton(Homepage);
				//List<WebElement> alltabs;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Unable to navigate to tabs as expeted");
			status = false;

		}

		return status;
	}

	public  boolean verifySecureloginSecion() {
		try {

			if (Securelogin.isDisplayed()) {
				System.out.println("Securelogin is displayed");
			}
			status = true;
		} catch (Exception e) {
			status = false;
			System.out.println(e.getMessage());
			System.out.println("Unable to find the Securelogin");
		}
		return status;
	}

	public  boolean ValidateCredentials() {
		try {

			clickandclear(Username, "admin");
			clickandclear(Password, "admin");
			status = true;

		} catch (Exception e) {
			status = false;
			System.out.println(e.getMessage());
			System.out.println("Invalid Username or Password");

		}
		return status;

	}

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public  boolean clickButton() {
		try {

			clickButton(Login);
			status = true;
			System.out.println("Able to click the element");
		} catch (Exception e) {
			status = false;
			System.out.println(e.getMessage());
			System.out.println("Unable to click on button");
		}
		return status;

	}
}
