#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login to opencart application
  I want to use this template for my feature file

  @tag1
  Scenario: Login successful
    Given launch the browser
    And Navigate to the URL
    When Enter the valid username and password
    And Click on login button
    Then verify the login
    And Close

  @tag2
  Scenario: Login unsuccessful
    Given launch the browser
    And Navigate to the URL
    When Enter the invalid username and password
    And Click on login utton
    Then login should be unsuccessful
