Feature: Invoice Display

  @invoiceDisplay
  Scenario: check invoice display
    Given click on transaction option
    When select invoice display
    And select delivery date
    Then view the display information