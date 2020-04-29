Feature: Bank manager Add customer successfully
  As a user
  I want to visit xyz bank website

  Scenario: Verify manager should add customer successfully
    Given I am on the Home Page
    And I click On bank manager login tab
    And I click on add customer tab
    When I enter first name "Hermoine"
    And I enter last name "Granger"
    And I enter postcode "E859AC"
    And I click on add customer button
    Then System should display popup message Click on ok button on pop up
    And System shows customer added successfully message


  Scenario: Verify bank manager should open account successfully
    Given I am on the Home Page
    And I click On bank manager login tab
    And I click on open account button
    When I select customer first name
    And I click on selected currency button
    And I select currency as pound
    And I click on process button
    Then I can see message account created successfully

  Scenario: verify customer should login and logout successfully
    Given I am on the Home Page
    And I click on customer login button
    And I click on to search your name
    When I click select name
    And I click on login button
    Then I should be login successfully and displayed logout message
    And I click on logout tab
    And I should see displayed your name