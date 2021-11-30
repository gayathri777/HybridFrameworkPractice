Feature: Automation practice Login feature
  As a user
  I want to create an account
  so that I can access my account

  Background:
    Given I am on the Home page
    When I select SignIn link
    Then I should see createAccountPanel on Authentication page
    #UnHappy path scenario
  @smoke
  Scenario:
    When I Enter emailId as gayathribommu777@gmail.com and click create an Account button
    Then I Should be on the Registration page
    When  I Select title as Mrs
    And  I provide firstName as Gayathri
    And  I select Date of birth as 8 3 2014
    And  I select state as Alabama
    And I click register button
    Then Account should not be created and I should see validation messages