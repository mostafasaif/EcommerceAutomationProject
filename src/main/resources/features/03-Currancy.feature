@smoke
Feature:  user could switch between currencies [$, €]

  Scenario: user can choose Euro currency
    Given   CLick on Currencues Selection
    When    user can select Euro from currency selection

    Then    All dollar sign change to Euro sign