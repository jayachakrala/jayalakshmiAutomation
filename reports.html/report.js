$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Homepage.feature");
formatter.feature({
  "line": 1,
  "name": "validate the following functionalities on the Homepage module",
  "description": "As an user I want to check the logo is displayed or not\r\n       and all the tabs are in the same order as expected.\r\n       and check whether SecureLogin Header is displayed or not\r\n       As an admin user Application should accept only admin credentials\r\n      If there is invalid username and password user must validate the error message\r\n      If the user forgot username and password should be able to reset",
  "id": "validate-the-following-functionalities-on-the-homepage-module",
  "keyword": "Feature"
});
formatter.background({
  "line": 8,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "that the user should launch the \"ff\" and enter \"url\"",
  "rows": [
    {
      "cells": [
        "Firefox",
        "http://server/bank"
      ],
      "line": 10
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "ff",
      "offset": 33
    },
    {
      "val": "url",
      "offset": 48
    }
  ],
  "location": "TC_01_Homepage.browser(String,String,DataTable)"
});
formatter.result({
  "duration": 17779687387,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "",
  "description": "This scenario is designed to validate the logo display and taborder in Homepage and wheter Securelogin is displayed or not \r\nand validating the credentials",
  "id": "validate-the-following-functionalities-on-the-homepage-module;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "the logo is displayed or not",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "the taborder of tabs in Homepage is as expected or not",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "the tabs navigating as expected",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "Secure Login Header is displayed or not",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Then enter  \"username\" and \"Password\"",
  "rows": [
    {
      "cells": [
        "admin",
        "admin"
      ],
      "line": 21
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "TC_01_Homepage.VerifyTaborder()"
});
formatter.result({
  "duration": 506307090,
  "status": "passed"
});
formatter.match({
  "location": "TC_01_Homepage.tabOrder()"
});
formatter.result({
  "duration": 366543682,
  "status": "passed"
});
formatter.match({
  "location": "TC_01_Homepage.navigationofTabs()"
});
formatter.result({
  "duration": 2830076650,
  "status": "passed"
});
formatter.match({
  "location": "TC_01_Homepage.displaySecureLogin()"
});
formatter.result({
  "duration": 52607228,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 13
    },
    {
      "val": "Password",
      "offset": 28
    }
  ],
  "location": "TC_01_Homepage.validatingCredentials(String,String,DataTable)"
});
formatter.result({
  "duration": 1591303959,
  "status": "passed"
});
formatter.match({
  "location": "TC_01_Homepage.clickonbutton()"
});
formatter.result({
  "duration": 313522923,
  "status": "passed"
});
});