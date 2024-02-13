Feature: Invoice Retailer

  @invoiceRetailer
  Scenario: check invoice retailer
    Given click on transaction option
    When select invoice retailer
    And fill delivery date and sr name
    Then view the information