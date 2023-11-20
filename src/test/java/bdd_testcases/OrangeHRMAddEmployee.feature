@OrangeHRM
Feature: To test OrangeHRM Add Employee functionality

  @OrangeHRM_AddEmployee
  Scenario: OrangeHRM Add Employee
    Given User launches OrangeHRM application in "chrome" browser
    When User entered "Admin" and "Admin@123" as credentials
    And User clicks on Login button
    Then User verifies Home Page title
    When User clicks on Employee Management link
    And User clicks on Add Employee button
    When User enters "Automation" and "Test" and "India Office" and click on Next button
    And User selects "married" and "female" and click on Next button
    And User selects "Region-2" and "0.5" and "Sub Unit-2" and clicks on Save button
    Then User verifies New EmployeeName and Employee ID