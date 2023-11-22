@All @DemoWebShop
Feature: DemoWebShop Login functionality

  @DemoWebShop_Login
  Scenario Outline: DemoWebShop Login
    Given User is opened "chrome" browser
    Given User is opened "DemoWebShop" Application URL
    When User enters "<UserName>" and "<Password>" in DemoWebShop Application
    And User clicks on Login button in DemoWebShop Application
    Then User validates email address in DemoWebShop Application
    And User Logout from DemoWebShop Application

    Examples:
    | UserName | Password |
    | aarosagarch@gmail.com | Admin@123 |
    | GayathriTest@gmail.com | Test@123 |
    | Srinath@gmail.com | Admin@123 |