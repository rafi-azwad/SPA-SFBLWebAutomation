Feature: Invoice Display

  @invoiceReturnFromRetailer
  Scenario: check invoice display
    Given click on transaction option
    When select invoice return from retailer
    And write the invoice number
    And select full or partial return
    And write return quantity
    Then save the invoice return from retailer