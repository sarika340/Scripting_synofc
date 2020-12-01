Feature: To Add GL Account - on Assignment of  GL Account
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
    And 	Enter All mendetry fields on Gl Category
    And     Click on Gl Save Button
    And     Click on Add button on Legal Entity
    And     Enter All mendetry fields on Legal Entity
    And     Click on Gl Save Button
    And     Click on Add button on Managment Entity
    And     Enter All mendetry fields on Managment Entity
    And     Click on Gl Save Button
    And     Enter Gl Category, Legal Entity,Managment Entity
    And     save and verify
    And     Search GL Account which is currently added
    And     Delete GL Account
    And     close the browser

  Scenario: To Add GL Category
    Given I launch chrome browser
    When I open Url "https://www.syncoffice.com/module-test-dashboard/dashboard"
    Then I Click on login button
    And I enter UserName "damawalemidc@gmail.com" And Password "Creta_123"
    And I Click on Login
    And 	Click on Account Reconciliation
    Then 	Hover on Right Side panel GL Category
    And 	Click on GL Category
    And 	Click on Add Button on GL Category
    And 	Enter Name on Add Account Category Drawer
    And  	Enter Description on Account Category Drawer
    And     save Gl category
    And     Search Gl category which is currently added
    And     Delete Gl category



  Scenario: Add Cost Centre
    Given I launch chrome browser
    When I open Url "https://www.syncoffice.com/module-test-dashboard/dashboard"
    Then I Click on login button
    And I enter UserName "damawalemidc@gmail.com" And Password "Creta_123"
    And I Click on Login
    And 	Click on Account Reconciliation
    Then 	Hover on Right Side panel Cost Center
    And 	Click on Cost Center
    And 	Click on Add Button on View Cost Center
    And 	Enter Code on Cost Center
    And 	Enter Enter Description on Cost Center
    And 	Enter Remarks on Cost Center
    And 	Click on Save on Cost Center
    And     Search Cost Centre  which is currently added
    And     Delete Cost Centre

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
    And     Search Cost Centre file which is currently added
    And     Delete Cost Centre file



  Scenario: To Upload Trial Balance
    Given  I launch chrome browser
    When   I open Url "https://www.syncoffice.com/module-test-dashboard/dashboard"
    Then   I Click on login button
    And    I enter UserName "damawalemidc@gmail.com" And Password "Creta_123"
    And    I Click on Login
    And 	Click on Account Reconciliation
    Then 	Hover on Right Side panel Trial Balance
    And 	Click on Trial Balance Importer
    And 	Click on Download sample file
    And 	Select Legal Entity for Trial Balance
    And 	Select Management Entity (Which will shows you assigned to Legal Entity)
    And 	Select the Range of Period
    And 	Click on upload (After adding the records into it)
    Then 	Click on Save and verify Trial Balance
    And     Search Trial Balance which is currently added
    And     Delete Trial Balance
    And     close the browser


  Scenario: To upload file sub GL_account
    Given I launch chrome browser
    When I open Url "https://www.syncoffice.com/module-test-dashboard/dashboard"
    Then I Click on login button
    And I enter UserName "damawalemidc@gmail.com" And Password "Creta_123"
    And I Click on Login
    And 	Click on Account Reconciliation
    Then 	Hover on Right Side panel
    And 	Click on sub GL Account
    And 	Click on Import Icon on View sub GL Account
    And 	Select the file from the list
    And 	Click on Save Button


  Scenario: To Add GL Account
    Given I launch chrome browser
    When I open Url "https://www.syncoffice.com/module-test-dashboard/dashboard"
    Then I Click on login button
    And I enter UserName "damawalemidc@gmail.com" And Password "Creta_123"
    And I Click on Login
    And 	Click on Account Reconciliation
    Then 	 Click on Import Icon on View GL Account
    Then      Select the file from the list
    Then     Click on Save Button
    Then     Save file data
    And     Search GL Account which is currently added
    And     Delete GL Account


