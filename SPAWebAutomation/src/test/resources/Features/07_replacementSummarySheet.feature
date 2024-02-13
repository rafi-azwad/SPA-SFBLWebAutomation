Feature: Replacement Summary Sheet

  @replacementSummarySheet
  Scenario: check replacement summary sheet
    Given click on transaction option
    When select replacement summary sheet
    And select market name
    And select replacement cause
    And add product
    Then save the replacement summary sheet's information