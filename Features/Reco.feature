Feature: To Add the Reco status
  Scenario :To Add the Reco Status
    Given I launch chrome browser
    When I open Url "https://www.syncoffice.com/module-test-dashboard/dashboard"
    Then I Click on login button
    And I enter UserName "damawalemidc@gmail.com" And Password "Creta_123"
    And I Click on Login
    And 	Click on Account Reconciliation
    Then 	Hover on Right Side panel
    And 	Click on Settings
    And 	Click on Reco Status Pane
    And 	Click on Add button on View Reco Status
    And 	Enter the Name on Reco Status
    And 	Enter the Description on Reco Status
    Then 	Save
    Then 	Verify