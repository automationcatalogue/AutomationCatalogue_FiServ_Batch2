@All @DemoWebShop
Feature: DemoWebShop Place Order with Multiple Items

  @DemoWebShop_PlaceOrder
  Scenario Outline: DemoWebShop PlaceOrder
    Given User is opened "chrome" browser
    Given User is opened "DemoWebShop" Application URL
    When User enters "<UserName>" and "<Password>" in DemoWebShop Application
    And User clicks on Login button in DemoWebShop Application
    Then User validates email address in DemoWebShop Application
    When User selects ProductCategory and added ProductName into Shopping Cart
          | ProductCategory | ProductName |
          | Books           | Computing and Internet |
          | Apparel & Shoes | Blue Jeans             |
          | Digital downloads | 3rd Album            |
    And User clicks on Shopping Cart link in DemoWebShop Application
    And User clicks on Checkout button by accepting terms
    And User place order with default configuration in DemoWebShop Application
    And User Logout from DemoWebShop Application

    Examples:
      | UserName | Password |
      | aarosagarch@gmail.com | Admin@123 |
      | GayathriTest@gmail.com | Test@123 |
      | Srinath@gmail.com | Admin@123 |