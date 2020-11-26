$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/home/nisha/master_syncoffice/Features/Bulkdata");
formatter.feature({
  "name": "To Add GL Account - on Assignment of  GL Account",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To Add GL Account",
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
  "status": "passed"
});
formatter.step({
  "name": "I enter UserName \"damawalemidc@gmail.com\" And Password \"Creta_123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.i_enter_UserName_And_Password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.i_Click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Account Reconciliation",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.click_on_Account_Reconciliation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Hover on Right Side panel",
  "keyword": "Then "
});
formatter.match({
  "location": "Master_stepdefinition.hover_on_Right_Side_panel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on GL Account",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.click_on_GL_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add Button on View GL Account",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.click_on_Add_Button_on_View_GL_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter GL Account Code",
  "keyword": "When "
});
formatter.match({
  "location": "Master_stepdefinition.enter_GL_Account_Code()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@name\u003d\"gl_code\"]\"}\n  (Session info: chrome\u003d87.0.4280.66)\n  (Driver info: chromedriver\u003d2.41.578700 (2f1ed5f9343c13f73144538f15c00b370eda6706),platform\u003dLinux 4.15.0-122-generic x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027nisha-Lenovo-ideapad-320-15ISK\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00274.15.0-122-generic\u0027, java.version: \u00271.8.0_272\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.41.578700 (2f1ed5f9343c13..., userDataDir: /tmp/.org.chromium.Chromium...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:35813}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 87.0.4280.66, webStorageEnabled: true}\nSession ID: 9d44d85607f013a4a473906237ed5261\n*** Element info: {Using\u003dxpath, value\u003d//*[@name\u003d\"gl_code\"]}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy14.sendKeys(Unknown Source)\n\tat Page_object.Gl_account_page.setGl_ode(Gl_account_page.java:167)\n\tat Step_defination.Master_stepdefinition.enter_GL_Account_Code(Master_stepdefinition.java:637)\n\tat ✽.Enter GL Account Code(file:/home/nisha/master_syncoffice/Features/Bulkdata:12)\n",
  "status": "failed"
});
formatter.step({
  "name": "Enter GL Description",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.enter_GL_Description()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Add Button on GL Category",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.click_on_Add_Button_on_GL_Category()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Gl Category, Legal Entity,Managment Entity",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.enter_Gl_Category_Legal_Entity_Managment_Entity()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "save and verify",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.save_and_verify()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "To Add Sub GL Account",
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
  "status": "passed"
});
formatter.step({
  "name": "I enter UserName \"damawalemidc@gmail.com\" And Password \"Creta_123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.i_enter_UserName_And_Password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.i_Click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Account Reconciliation",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.click_on_Account_Reconciliation()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[text()\u003d\"Account Reconciliation\"]\"}\n  (Session info: chrome\u003d87.0.4280.66)\n  (Driver info: chromedriver\u003d2.41.578700 (2f1ed5f9343c13f73144538f15c00b370eda6706),platform\u003dLinux 4.15.0-122-generic x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027nisha-Lenovo-ideapad-320-15ISK\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00274.15.0-122-generic\u0027, java.version: \u00271.8.0_272\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.41.578700 (2f1ed5f9343c13..., userDataDir: /tmp/.org.chromium.Chromium...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:35691}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 87.0.4280.66, webStorageEnabled: true}\nSession ID: 8347f59b28358c100d0fe734e77761e3\n*** Element info: {Using\u003dxpath, value\u003d//*[text()\u003d\"Account Reconciliation\"]}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy14.click(Unknown Source)\n\tat Page_object.Gl_account_page.setAc_button(Gl_account_page.java:150)\n\tat Step_defination.Master_stepdefinition.click_on_Account_Reconciliation(Master_stepdefinition.java:605)\n\tat ✽.Click on Account Reconciliation(file:/home/nisha/master_syncoffice/Features/Bulkdata:25)\n",
  "status": "failed"
});
formatter.step({
  "name": "Hover on Sub GL Account",
  "keyword": "Then "
});
formatter.match({
  "location": "Master_stepdefinition.hover_on_Sub_GL_Account()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Sub GL Account",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.click_on_Sub_GL_Account()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Add Button on View sub GL Account",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.click_on_Add_Button_on_View_sub_GL_Account()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Select the  Gl Account",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.select_the_Gl_Account()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Name which should be associated_with Sub GL Account",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.enter_Name_which_should_be_associated_with_Sub_GL_Account()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter GL_Description Sub GL Account",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.enter_GL_Description_Sub_GL_Account()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Select Legal Entity to assign a Management entity with_sub Gl account",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.select_Legal_Entity_to_assign_a_Management_entity_with_sub_Gl_account()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Management Entity’s Add button",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.click_on_Management_Entity_s_Add_button()"
});
formatter.result({
  "status": "skipped"
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
  "status": "passed"
});
formatter.step({
  "name": "I enter UserName \"damawalemidc@gmail.com\" And Password \"Creta_123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.i_enter_UserName_And_Password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.i_Click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Account Reconciliation",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.click_on_Account_Reconciliation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Hover on Right Side panel GL Category",
  "keyword": "Then "
});
formatter.match({
  "location": "Master_stepdefinition.hover_on_Right_Side_panel_GL_Category()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on GL Category",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.click_on_GL_Category()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add Button on GL Category",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.click_on_Add_Button_on_GL_Category()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Name on Add Account Category Drawer",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.enter_Name_on_Add_Account_Category_Drawer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Description on Account Category Drawer",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.enter_Description_on_Account_Category_Drawer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the Category",
  "keyword": "Then "
});
formatter.match({
  "location": "Master_stepdefinition.verify_the_Category()"
});
formatter.result({
  "status": "passed"
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
  "status": "passed"
});
formatter.step({
  "name": "I enter UserName \"damawalemidc@gmail.com\" And Password \"Creta_123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.i_enter_UserName_And_Password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.i_Click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Account Reconciliation",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.click_on_Account_Reconciliation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Hover on Right Side panel",
  "keyword": "Then "
});
formatter.match({
  "location": "Master_stepdefinition.hover_on_Right_Side_panel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on GL Account",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.click_on_GL_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Import Icon on View GL Account",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.click_on_Import_Icon_on_View_GL_Account()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003cspan class\u003d\"material-icons MuiIcon-root-2890\" aria-hidden\u003d\"true\" style\u003d\"color: rgba(0, 0, 0, 0.26); cursor: pointer;\"\u003e...\u003c/span\u003e is not clickable at point (1235, 620). Other element would receive the click: \u003cdiv class\u003d\"MuiBox-root-2530 jss3136\"\u003e...\u003c/div\u003e\n  (Session info: chrome\u003d87.0.4280.66)\n  (Driver info: chromedriver\u003d2.41.578700 (2f1ed5f9343c13f73144538f15c00b370eda6706),platform\u003dLinux 4.15.0-122-generic x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027nisha-Lenovo-ideapad-320-15ISK\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00274.15.0-122-generic\u0027, java.version: \u00271.8.0_272\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.41.578700 (2f1ed5f9343c13..., userDataDir: /tmp/.org.chromium.Chromium...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:34615}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 87.0.4280.66, webStorageEnabled: true}\nSession ID: 7e07e017ac51893dc9483964cff230a8\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\n\tat sun.reflect.GeneratedMethodAccessor3.invoke(Unknown Source)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\n\tat com.sun.proxy.$Proxy14.click(Unknown Source)\n\tat Page_object.Gl_account_Upload_file.setCloud(Gl_account_Upload_file.java:62)\n\tat Step_defination.Master_stepdefinition.click_on_Import_Icon_on_View_GL_Account(Master_stepdefinition.java:1105)\n\tat ✽.Click on Import Icon on View GL Account(file:/home/nisha/master_syncoffice/Features/Bulkdata:64)\n",
  "status": "failed"
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
  "name": "Save bulk data",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.save_bulk_data()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify bulk data",
  "keyword": "Then "
});
formatter.match({
  "location": "Master_stepdefinition.verify_bulk_data()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "To upload file in cost center",
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
  "status": "passed"
});
formatter.step({
  "name": "I enter UserName \"damawalemidc@gmail.com\" And Password \"Creta_123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.i_enter_UserName_And_Password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.i_Click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Account Reconciliation",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.click_on_Account_Reconciliation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Hover on Right Side panel Cost Centre bulk data",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Click on Import Icon on View Cost Centre bulk",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Select the file from the list for Cost Centre bulk",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Click on Save Button on Cost Centre",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Save bulk data",
  "keyword": "And "
});
formatter.match({
  "location": "Master_stepdefinition.save_bulk_data()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify bulk data",
  "keyword": "Then "
});
formatter.match({
  "location": "Master_stepdefinition.verify_bulk_data()"
});
formatter.result({
  "status": "skipped"
});
});