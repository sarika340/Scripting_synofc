$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/home/nisha/master_syncoffice/Cloud.features/To_Preview");
formatter.feature({
  "name": "To",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To Preview File",
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
  "name": "Click on Cloud",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.click_on_Cloud()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on My Cloud",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.click_on_My_Cloud()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Hover on file",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.hoverOnFile()"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementNotVisibleException: element not visible\n  (Session info: chrome\u003d87.0.4280.66)\n  (Driver info: chromedriver\u003d2.41.578700 (2f1ed5f9343c13f73144538f15c00b370eda6706),platform\u003dLinux 4.15.0-126-generic x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027nisha-Lenovo-ideapad-320-15ISK\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00274.15.0-126-generic\u0027, java.version: \u00271.8.0_275\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.41.578700 (2f1ed5f9343c13..., userDataDir: /tmp/.org.chromium.Chromium...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:41663}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 87.0.4280.66, webStorageEnabled: true}\nSession ID: 85f898e58bb2132bd2f9ae5eadad29b6\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\n\tat com.sun.proxy.$Proxy15.click(Unknown Source)\n\tat Cloud_Pages.To_preview.setUpload_file(To_preview.java:89)\n\tat Step_defination.stepdefinitions.hoverOnFile(stepdefinitions.java:2209)\n\tat ✽.Hover on file(file:/home/nisha/master_syncoffice/Cloud.features/To_Preview:10)\n",
  "status": "failed"
});
formatter.step({
  "name": "Click Preview Icon",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.clickPreviewIcon()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.verify()"
});
formatter.result({
  "status": "skipped"
});
});