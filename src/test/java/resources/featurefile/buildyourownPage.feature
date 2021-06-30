Feature: Build your own computer page functionality
  As a user I should able to navigate through build your own computer page successfully


  @Regression
  Scenario: User should be able to buy product from build your own computer page
    Given I am on homepage
    And I click on "Computers"Tab
    And I click on  desktop tab
    And I select "Name: A to Z" from dropdown list
    And I click on 'add to cart' button
    When I see 'build your own' page
    And I select processor "2.2 GHz Intel Pentium Dual-Core E2200" from dropdown
    And I select Ram "8GB [+$60.00]" from dropdownlist
    And I click on HDD "400 GB [+$100.00]" radio buttton
    And I click on OS "Vista Premium [+$60.00]" radio button
    And I click Two check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"checkbox
    And I verify price "$1,475.00"
    And I click on "ADD TO CARD" Button.
    Then I should see Message on top green bar like "The product has been added to your shopping cart"


