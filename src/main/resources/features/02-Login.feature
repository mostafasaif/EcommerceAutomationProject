@smoke
Feature:users could use login functionality to use their accounts
  Scenario: : user could login with valid email and password
    Given user navigate to login page
    When login with valid "mustafa.mohamed@gmail.com" and "M0stafa"
    Then  user press on login button
    And  user login to the system successfully


  Scenario: user could login with invalid email and password
    Given user navigate to login page
    When login with invalid email "mostafa.m@gamil.com" and invalid password "Mostafa"
    Then user press on login button
    And user could not login to the system
