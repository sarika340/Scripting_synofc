@blast
Feature: Syncoffice Login
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
    And Registraion value data"PAN"
    Then Enter the Doucument name"PAN"
    And Click on save button

  Scenario: Roles_and_permission__Employee_permission
    Given I launch chrome browser
    When I open Url "https://www.syncoffice.com/module-test-dashboard/dashboard"
    Then I Click on login button
    And I enter UserName "sarika.mishra@candytechnologies.in" And Password "123456"
    And I Click on Login
    And Click on masters
    And  click on client should open list
    Then Click on Roles and permission
    Then Click on Select the Employee
    Then Click on go
    Then Click on Cloud
    Then Click on Submit_button


    Scenario: Roles_and_permission__Employee_To_company
      Given I launch chrome browser
      When I open Url "https://www.syncoffice.com/module-test-dashboard/dashboard"
      Then I Click on login button
      And I enter UserName "sarika.mishra@candytechnologies.in" And Password "123456"
      And I Click on Login
      And Click on masters
      And  click on client should open list
      Then Click on Roles and permission
      Then Click on Employee_To_company
      Then Click on All Employee or Select_the Employee
      Then Click on All company or select_the_company
      Then Click on submit

@Roles
        Scenario: Roles_and_permission__Employee_To_company                                     
          Given I launch chrome browser                                                         
          When I open Url "https://www.syncoffice.com/module-test-dashboard/dashboard"          
          Then I Click on login button                                                          
          And I enter UserName "sarika.mishra@candytechnologies.in" And Password "123456"       
          And I Click on Login                                                                  
          And Click on masters                                                                  
          And  click on client should open list
          Then Click on Roles and permission
          And Click on Add Employee_To_Client
         Then Click on All Employee or Select_the Employee
          Then Select the Client
          Then Select the Location
          Then Select the Department
          Then Click on Submit_button

          Scenario: Roles_and_permission__Staff_to_client
            Given I launch chrome browser
            When I open Url "https://www.syncoffice.com/module-test-dashboard/dashboard"
            Then I Click on login button
            And I enter UserName "sarika.mishra@candytechnologies.in" And Password "123456"
            And I Click on Login
            And Click on masters
            And  click on client should open list
            Then click on Staff_to_client
            Then Select the client in dropdownlist
            Then Click on submit



