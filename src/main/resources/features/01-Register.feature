@smoke
Feature: F1_Register users could register with new accounts


  Scenario: guest user could register with valid data successfully
    Given user go to register page
    When user enter gender type
    And user enter first name "mostafa" and last name "mohamed"
    And  user enter date of birth
    And user enter email and companyName
    And  user fills Password fields "M0stafa" "M0stafa"
    And user clicks on register button
    Then success message is displayed