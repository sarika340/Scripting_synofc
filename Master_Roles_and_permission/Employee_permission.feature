Feature: Roles_and_permission_employee_permission
  Scenario: Set Roles and Permission (Read) (All Modules)
    Given I launch chrome browser
    When I open Url "https://www.syncoffice.com/module-test-dashboard/dashboard"
    Then I Click on login button
    And I enter UserName "sarika.mishra@candytechnologies.in" And Password "123456"
    And I Click on Login
    And Click on masters
    And Mouse over on module list
    Then Click on Roles and Permissions tab
    And Click on the Employee Permissions SubTab
    When  Search Employee
    Then select the Read Permission options for Modules
    Then Select Modules to apply to the specific Employee
