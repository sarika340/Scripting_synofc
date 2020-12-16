$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/home/nisha/master_syncoffice/Master_Roles_and_permission/Employee_permission.feature");
formatter.feature({
  "name": "Roles_and_permission_employee_permission",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Set Roles and Permission (Read) (All Modules)",
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
  "name": "I enter UserName \"sarika.mishra@candytechnologies.in\" And Password \"123456\"",
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
  "name": "Click on masters",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.click_on_masters()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//span[contains(text(),\u0027Master\u0027)]\"}\n  (Session info: chrome\u003d87.0.4280.66)\n  (Driver info: chromedriver\u003d2.41.578700 (2f1ed5f9343c13f73144538f15c00b370eda6706),platform\u003dLinux 4.15.0-128-generic x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027nisha-Lenovo-ideapad-320-15ISK\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00274.15.0-128-generic\u0027, java.version: \u00271.8.0_275\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.41.578700 (2f1ed5f9343c13..., userDataDir: /tmp/.org.chromium.Chromium...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:40213}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 87.0.4280.66, webStorageEnabled: true}\nSession ID: b4be7c1de00dc548eeb3234be04dc26f\n*** Element info: {Using\u003dxpath, value\u003d//span[contains(text(),\u0027Master\u0027)]}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy15.click(Unknown Source)\n\tat Master_Roles_and_Permission_Page.Register_variable_data_page.setMaster(Register_variable_data_page.java:81)\n\tat Step_defination.stepdefinitions.click_on_masters(stepdefinitions.java:174)\n\tat ✽.Click on masters(file:/home/nisha/master_syncoffice/Master_Roles_and_permission/Employee_permission.feature:8)\n",
  "status": "failed"
});
formatter.step({
  "name": "Mouse over on module list",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.mouse_over_on_module_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Roles and Permissions tab",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.click_on_Roles_and_Permissions_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on the Employee Permissions SubTab",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.click_on_the_Employee_Permissions_SubTab()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Search Employee",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.search_Employee()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "select the Read Permission options for Modules",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.select_the_Read_Permission_options_for_Modules()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Select Modules to apply to the specific Employee",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.select_Modules_to_apply_to_the_specific_Employee()"
});
formatter.result({
  "status": "skipped"
});
});