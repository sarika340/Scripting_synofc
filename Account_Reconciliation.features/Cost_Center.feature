Feature: To Add Cost Centre
  Scenario: Add Cost Centre
    Given I launch chrome browser
    When I open Url "https://www.syncoffice.com/module-test-dashboard/dashboard"
    Then I Click on login button
    And I enter UserName "damawalemidc@gmail.com" And Password "Creta_123"
    And I Click on Login
    And 	Click on Account Reconciliation tab
    Then 	Hover on Right Side panel Cost Center
    And 	Click on Cost Center
    And 	Click on Add Button on View Cost Center
    And 	Enter Code on Cost Center
    And 	Enter Enter Description on Cost Center
    And 	Enter Remarks on Cost Center
    And 	Click on Save on Cost Center
    And     Search Cost Centre  which is currently added
    And     Delete Cost Centre
    And     close the browser
