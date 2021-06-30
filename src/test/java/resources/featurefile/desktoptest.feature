Feature: Desktop menu functionality
  As a User I should be able to navigate through desktop page



  Scenario: User should be able to see products arranged in reverse alphabetical order on desktop page

    Given I am on homepage
    When I click on Computers tab
    And I click on desktop tab
    And I select "Name: Z to A" from dropdown list
    Then I should see products arranged in reverse alphabetical order

