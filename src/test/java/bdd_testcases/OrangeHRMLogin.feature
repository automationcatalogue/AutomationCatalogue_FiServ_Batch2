@All @OrangeHRM
Feature: To test the Orange HRM Application Login functionality

  Background: Browser Launch and Open OrangeHRM Application
    Given User is opened "chrome" browser
    Given User is opened "OrangeHRM" Application URL

  @OrangeHRM_ValidLogin @OrangeHRMLogin
  Scenario: OrangeHRM Login with valid data
    When User is entered "Amanda" as UserName
    And User is entered "Admin@123" as Password
    And User clicks on Login button
    Then User verifies Home Page title
    #When User clicks on Logout button
    #Then User closes browser

  @OrangeHRM_InValidLogin @OrangeHRMLogin
  Scenario: OrangeHRM Login with Invalid data
    When User is entered "Admin" as UserName
    And User is entered Invalid Password
    And User clicks on Login button
    Then User verifies Invalid credentials message
    #When User clicks on Logout button
    #Then User closes browser