@regression
Feature: Automation practice Login feature
  As a user
  I want to login to my account
  so that I can access my account details

  Background:
    Given I am on the Home page
    When I select SignIn link
    Then I should be on Authentication page
  #Happy path Scenario
  @smoke
  Scenario: verify user can login successfully with valid credentials
    When I provide username as 58gayathri@gmail.com and password as Gayathri
    And click SignIn button
    Then I should be logged in successfully and I should be on My Account page
    And I will signOut

    #Unhappy path Scenario
  #Incorrect username and incorrect password
  @smoke
  Scenario: Verify that user cannot login with Invalid credentials & see validation message
    When I provide username as 58gayathriii@gmail.com and password as Gayathriii
    And click SignIn button
    Then I should be on SignIn Page
    And I should see validation message as Authentication failed.