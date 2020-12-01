Feature: To Assign the Staff permission
  Scenario: To Assign Selected Staff a permissions
    Given I launch chrome browser
    When I open Url "https://www.syncoffice.com/module-test-dashboard/dashboard"
    Then I Click on login button
    And I enter UserName "sarika.mishra@candytechnologies.in" And Password "123456"
    And I Click on Login
    And Click on masters
    And Mouse over on module list
    Then Click on Roles and Permissions tab
    Then Click on Client Name to give Permissions
    Then Select the type of permissions
    Then Click on Submit Button


