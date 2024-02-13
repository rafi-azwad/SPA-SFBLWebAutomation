Feature: Order Transaction

  @orderRetailer
  Scenario: Add order retailer
    Given click on transaction option
    When select order retailer
    And fill in the required information
    Then save and submit the information

