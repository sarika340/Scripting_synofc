Feature: To Add Cost Centre
  Scenario: Add Cost Centre
    Given I launch chrome browser
    When I open Url "https://www.syncoffice.com/module-test-dashboard/dashboard"
    Then I Click on login button
    And I enter UserName "damawalemidc@gmail.com" And Password "Creta_123"
    And I Click on Login
    And 	Click on Account Reconciliation
    Then 	Hover on Right Side panel Cost Centre
    And 	Click on Cost Centre
    And 	Click on Add Button on View Cost Centre
    And 	Enter Code on Cost Centre
    And 	Enter Enter Description on Cost Centre
    And 	Enter Remarks on Cost Centre
    And 	Click on Save on Cost Centre
    Then 	Verify Cost Centre

  Scenario: To Add cost center file
    Given I launch chrome browser
    When I open Url "https://www.syncoffice.com/module-test-dashboard/dashboard"
    Then I Click on login button
    And I enter UserName "damawalemidc@gmail.com" And Password "Creta_123"
    And I Click on Login
    And 	Click on Account Reconciliation
    Then 	Hover on Right Side panel Setting (Cost Centre)
    And 	Click on Import Icon on View Cost Centre
    And 	Select the file from the list for Cost Centre
    And 	Click on Save Button on Cost Centre
    Then 	Verify cost center file