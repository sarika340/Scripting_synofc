$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/home/nisha/master_syncoffice/Features/Upload%20file_Sub_Gl_account");
formatter.feature({
  "name": "SUB GL ACCOUNT",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To upload file GLaccount",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Master_stepdefinition.i_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I open Url \"https://www.syncoffice.com/module-test-dashboard/dashboard\"",
  "keyword": "When "
});
formatter.match({
  "location": "Master_stepdefinition.i_open_Url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Master_stepdefinition.i_Click_on_login_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@class\u003d\u0027MuiButton-label\u0027]\"}\n  (Session info: chrome\u003d87.0.4280.66)\n  (Driver info: chromedriver\u003d2.41.578700 (2f1ed5f9343c13f73144538f15c00b370eda6706),platform\u003dLinux 4.15.0-122-generic x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027nisha-Lenovo-ideapad-320-15ISK\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00274.15.0-122-generic\u0027, java.version: \u00271.8.0_272\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.41.578700 (2f1ed5f9343c13..., userDataDir: /tmp/.org.chromium.Chromium...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:35023}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 87.0.4280.66, webStorageEnabled: true}\nSession ID: 850bfc701a4f3867532552c413a59818\n*** Element info: {Using\u003dxpath, value\u003d//*[@class\u003d\u0027MuiButton-label\u0027]}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy14.click(Unknown Source)\n\tat Page_object.Register_variable_data_page.set(Register_variable_data_page.java:63)\n\tat Step_defination.Master_stepdefinition.i_Click_on_login_button(Master_stepdefinition.java:101)\n\tat ✽.I Click on login button(file:/home/nisha/master_syncoffice/Features/Upload%20file_Sub_Gl_account:5)\n",
  "status": "failed"
});
formatter.step({
  "name": "I enter UserName \"damawalemidc@gmail.com\" And Password \"Creta_123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.i_enter_UserName_And_Password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.i_Click_on_Login()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Account Reconciliation",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.click_on_Account_Reconciliation()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Hover on Right Side panel",
  "keyword": "Then "
});
formatter.match({
  "location": "Master_stepdefinition.hover_on_Right_Side_panel()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on sub GL Account",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.click_on_sub_GL_Account()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Import Icon on View sub GL Account",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.click_on_Import_Icon_on_View_sub_GL_Account()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Select the file from the list",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.select_the_file_from_the_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Save Button",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.click_on_Save_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify  sub GL Account file",
  "keyword": "Then "
});
formatter.match({
  "location": "Master_stepdefinition.verify_sub_GL_Account_file()"
});
formatter.result({
  "status": "skipped"
});
});