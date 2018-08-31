package com.stepdefinitions;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import com.genericfunctions.Genericmethods;
import com.screenfunctions.Home_Page;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC_01_Homepage extends Genericmethods {

	@Given("^that the user should launch the \"([^\"]*)\" and enter \"([^\"]*)\"$")
	public static void browser(String browser, String url, DataTable table) {
	

		List<List<String>> data = table.raw();
		System.out.println(data.get(0).get(0));
		url = data.get(0).get(1);
		launchBrowser(browser, url);

	}

	@Then("the logo is displayed or not")
	public static void VerifyTaborder() {
		Home_Page homepage = PageFactory.initElements(driver, Home_Page.class);

		homepage.verifyLogo();

	}

	@And("the taborder of tabs in Homepage is as expected or not")
	public static void tabOrder() {
		Home_Page homepage = PageFactory.initElements(driver, Home_Page.class);

		homepage.HomePageTabOrder();

	}

	@When("the tabs navigating as expected")
	public static void navigationofTabs() {
		Home_Page homepage = PageFactory.initElements(driver, Home_Page.class);
		homepage.validateTabs();
	}

	@Then("Secure Login Header is displayed or not")
	public static void displaySecureLogin() {
		Home_Page homepage = PageFactory.initElements(driver, Home_Page.class);

		homepage.verifySecureloginSecion();

	}

	@When("^Then enter  \"([^\"]*)\" and \"([^\"]*)\"$")
	public static void validatingCredentials(String Username, String Password, DataTable table) {
		Home_Page homepage = PageFactory.initElements(driver, Home_Page.class);

		List<List<String>> data = table.raw();
		Username = data.get(0).get(0);
		Password = data.get(0).get(1);
		homepage.ValidateCredentials();

	}

	@And("^click on login button$")
	public static void clickonbutton() {
		Home_Page homepage = PageFactory.initElements(driver, Home_Page.class);

		homepage.clickButton();

	}

}
