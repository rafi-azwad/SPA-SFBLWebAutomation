Feature: Requisition to Factory

  @requisitionToFactory
  Scenario: check requisition to factory
    Given click on transaction option
    When select requisition to factory
    And select the add items
    And write how many boxes you require
    Then save the requisition to factory's information