Feature: Searching for images on Google

  Scenario: Search for images related to a specific keyword
    Given I am on the Google main page
    When I click the reject everything button
    When I search for "PKO"
    When I go to images
    Then I should see image results

  Scenario: Click on an image result
    Given I am on the Google main page
    When I click the reject everything button
    When I search for "PKO"
    When I go to images
    Then I should see image results
    When I click on image result number 3
    Then I should see the enlarged image
