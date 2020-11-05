Feature: To Add GL Account - on Assignment of Sub GL Account
  Scenario: To Add GL Account
    Given I launch chrome browser
    When I open Url "https://www.syncoffice.com/module-test-dashboard/dashboard"
    Then I Click on login button
    And I enter UserName "sarika.mishra@candytechnologies.in" And Password "123456"
    And I Click on Login
    And 	Click on Account Reconciliation
    Then 	Hover on Right Side panel
    And 	Click on GL Account
    And 	Click on Add Button on View GL Account
    When 	Enter GL Account Code
    And 	Enter GL Description
    And  	Select GL Category
    And  	Select Legal Entity
    And  	Select Management Entity (Which shows Assigned list with Legal Entity)
    Then 	Enter Account Purpose
    Then 	Verify
