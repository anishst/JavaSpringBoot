Feature: To Test Google Search
#  Tests the Google Search Feature

# simple format
  Scenario: Test Google Search
    Given User is on Google Search Page
    When I enter Google in box
    And I click on Search button
    Then Show Results

# data table example
  Scenario Outline: Test Google Search using data tables
    Given User is on Google Search Page
    When I enter <search_term> in box
    And I click on Search button
    Then Show Results

    Examples:
      | search_term|
      | cucumber  |
      | java      |
