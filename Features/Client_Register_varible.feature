Feature: Syncoffice Login_page
  Scenario: Master page
    Given I launch chrome browser
    When I open Url "https://www.syncoffice.com/module-test-dashboard/dashboard"
    Then I Click on login button
    And I enter UserName "sarika.mishra@candytechnologies.in" And Password "123456"
    And I Click on Login
    And Click on masters
    And  click on client should open list
    Then  click  on Register Varible data
    Then page "Variable Data" should display
    Then Click on Add button on Register Varible data
    And Registraion value data
    Then Enter the Doucument name
    And Click on save button