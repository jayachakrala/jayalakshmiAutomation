Feature: validate the following functionalities on the Homepage module 
	As an user I want to check the logo is displayed or not
         and all the tabs are in the same order as expected.
         and check whether SecureLogin Header is displayed or not
         As an admin user Application should accept only admin credentials
        If there is invalid username and password user must validate the error message
        If the user forgot username and password should be able to reset
Background: 
	Given that the user should launch the "ff" and enter "url" 
		|Firefox|http://server/bank|
		
@smoketest 
Scenario: 
	This scenario is designed to validate the logo display and taborder in Homepage and wheter Securelogin is displayed or not 
	and validating the credentials
	Then the logo is displayed or not 
	And the taborder of tabs in Homepage is as expected or not 
	When  the tabs navigating as expected 
	Then Secure Login Header is displayed or not 
	When Then enter  "username" and "Password" 
		|admin|admin|
	And click on login button 
