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

public class TC_02Admin_Page extends Genericmethods {

	@Given("^that the user should launch the \"([^\"]*)\" and enter \"([^\"]*)\"$")
	public static void browser(String browser, String url, DataTable table) {
	

		List<List<String>> data = table.raw();
		System.out.println(data.get(0).get(0));
		url = data.get(0).get(1);
		launchBrowser(browser, url);

	}
@Then("check whether Username and Password labels are displayed or not ")
public void ValidateLabels()
{
	
}


}