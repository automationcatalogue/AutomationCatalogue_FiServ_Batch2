@All @OrangeHRM
Feature: To test the Orange HRM Application Login functionality

  @OrangeHRM_ValidLogin @OrangeHRMLogin
  Scenario: OrangeHRM Login with valid data
    Given User is opened "chrome" browser
    Given User is opened Orange HRM Application URL
    When User is entered "Amanda" as UserName
    And User is entered "Admin@123" as Password
    And User clicks on Login button
    Then User verifies Home Page title
    #When User clicks on Logout button
    #Then User closes browser

  @OrangeHRM_InValidLogin @OrangeHRMLogin
  Scenario: OrangeHRM Login with Invalid data
    Given User is opened chrome browser
    Given User is opened Orange HRM Application URL
    When User is entered "Admin" as UserName
    And User is entered Invalid Password
    And User clicks on Login button
    Then User verifies Invalid credentials message
    #When User clicks on Logout button
    #Then User closes browser