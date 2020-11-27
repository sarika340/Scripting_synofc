Feature: To Add GL Account - on Assignment of Sub GL Account
  Scenario: To Add GL Account
    Given I launch chrome browser
    When I open Url "https://www.syncoffice.com/module-test-dashboard/dashboard"
    Then I Click on login button
    And I enter UserName "damawalemidc@gmail.com" And Password "Creta_123"
    And I Click on Login
    And 	Click on Account Reconciliation
    Then 	Hover on Right Side panel
    And 	Click on GL Account
    And 	Click on Add Button on View GL Account
    When 	Enter GL Account Code
    And 	Enter GL Description
    And 	Click on Add Button on GL Category
    And 	Enter Gl Category, Legal Entity,Managment Entity
    And     save and verify

