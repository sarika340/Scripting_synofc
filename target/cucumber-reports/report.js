$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/home/nisha/master_syncoffice/Account_Reconciliation.features/Add_category");
formatter.feature({
  "name": "To Add GL Category",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To Add GL Category",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.i_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I open Url \"https://www.syncoffice.com/module-test-dashboard/dashboard\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.i_open_Url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.i_Click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter UserName \"damawalemidc@gmail.com\" And Password \"Creta_123\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.i_enter_UserName_And_Password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.i_Click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Account Reconciliation tab",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.clickOnAccountReconciliationTab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Hover on Right Side panel GL Category",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.hover_on_Right_Side_panel_GL_Category()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on GL Category",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.click_on_GL_Category()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add Button on GL Category",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.click_on_Add_Button_on_GL_Category()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Name on Add Account Category Drawer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.enter_Name_on_Add_Account_Category_Drawer()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: cannot focus element\n  (Session info: chrome\u003d87.0.4280.66)\n  (Driver info: chromedriver\u003d2.41.578700 (2f1ed5f9343c13f73144538f15c00b370eda6706),platform\u003dLinux 4.15.0-128-generic x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027nisha-Lenovo-ideapad-320-15ISK\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00274.15.0-128-generic\u0027, java.version: \u00271.8.0_275\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.41.578700 (2f1ed5f9343c13..., userDataDir: /tmp/.org.chromium.Chromium...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:36259}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 87.0.4280.66, webStorageEnabled: true}\nSession ID: af9c8eb35d0441fed3ca7e5b65ec12a0\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:106)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\n\tat com.sun.proxy.$Proxy15.sendKeys(Unknown Source)\n\tat Account_Reconciliation_page.Gl_category.setName(Gl_category.java:72)\n\tat Step_defination.stepdefinitions.enter_Name_on_Add_Account_Category_Drawer(stepdefinitions.java:777)\n\tat ✽.Enter Name on Add Account Category Drawer(file:/home/nisha/master_syncoffice/Account_Reconciliation.features/Add_category:12)\n",
  "status": "failed"
});
formatter.step({
  "name": "Enter Description on Account Category Drawer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.enter_Description_on_Account_Category_Drawer()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "save Gl category",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.save_Gl_category()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Search Gl category which is currently added",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.search_Gl_category_which_is_currently_added()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Delete Gl category",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.delete_Gl_category()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Add Cost Centre",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.i_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I open Url \"https://www.syncoffice.com/module-test-dashboard/dashboard\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.i_open_Url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.i_Click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter UserName \"damawalemidc@gmail.com\" And Password \"Creta_123\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.i_enter_UserName_And_Password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.i_Click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Account Reconciliation tab",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.clickOnAccountReconciliationTab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Hover on Right Side panel Cost Center",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.hover_on_Right_Side_panel_Cost_Center()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Cost Center",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.click_on_Cost_Center()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[text()\u003d\"business\"]\"}\n  (Session info: chrome\u003d87.0.4280.66)\n  (Driver info: chromedriver\u003d2.41.578700 (2f1ed5f9343c13f73144538f15c00b370eda6706),platform\u003dLinux 4.15.0-128-generic x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027nisha-Lenovo-ideapad-320-15ISK\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00274.15.0-128-generic\u0027, java.version: \u00271.8.0_275\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.41.578700 (2f1ed5f9343c13..., userDataDir: /tmp/.org.chromium.Chromium...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:42365}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 87.0.4280.66, webStorageEnabled: true}\nSession ID: 8ed7bbbb45d6fe1197863ac9f9023704\n*** Element info: {Using\u003dxpath, value\u003d//*[text()\u003d\"business\"]}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy15.click(Unknown Source)\n\tat Account_Reconciliation_page.Cost_center_page.setCost(Cost_center_page.java:44)\n\tat Step_defination.stepdefinitions.click_on_Cost_Center(stepdefinitions.java:1254)\n\tat ✽.Click on Cost Center(file:/home/nisha/master_syncoffice/Account_Reconciliation.features/Add_category:27)\n",
  "status": "failed"
});
formatter.step({
  "name": "Click on Add Button on View Cost Center",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.click_on_Add_Button_on_View_Cost_Center()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Code on Cost Center",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.enter_Code_on_Cost_Center()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Enter Description on Cost Center",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.enter_Enter_Description_on_Cost_Center()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Remarks on Cost Center",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.enter_Remarks_on_Cost_Center()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Save on Cost Center",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.click_on_Save_on_Cost_Center()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Search Cost Centre  which is currently added",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.search_Cost_Centre_which_is_currently_added()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Delete Cost Centre",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.delete_Cost_Centre()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "To Upload Trial Balance",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.i_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I open Url \"https://www.syncoffice.com/module-test-dashboard/dashboard\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.i_open_Url(String)"
});
