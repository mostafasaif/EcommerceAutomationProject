@smoke

Feature: user can navigate to social media
  Scenario: user navigate to facebook
    When  user opens facebook link
    Then  facebook is Opened in a new tab


  Scenario: user navigate to Twitter
    When  user opens Twitter link
    Then  Twitter is Opened in a new tab

  Scenario: user navigate to rss
    When  user opens rss link
    Then  rss is Opened in a new tab

  Scenario: user navigate to youtube
    When  user opens youtube link
    Then  youtube is Opened in a new tab
