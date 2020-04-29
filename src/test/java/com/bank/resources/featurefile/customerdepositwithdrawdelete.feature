Feature: Customer deposit money withdrawal money delete account functionality
  As a user
  I want to visit xyz bank website

  Scenario: Verify customer should deposit money successfully
    Given I am on the Home Page
    And I click on customer login button
    And I search customer that is created
    And I select searched customer
    And I click on login button
    And I click on deposit button
    When I enter amount "100"
    And I click on deposit button
    Then I should see deposit amount successfully


  Scenario: verify customer should withdraw money successfully
    Given I am on the Home Page
    And I click on customer login button
    And I search customer that is created
    And I select searched customer
    And I click on login button
    And I click on withdrawal button
    When I enter amount "50"
    And I click on withdrawal button
    Then I customer should withdrawal amount successfully


  Scenario: verify bank manager should delete customer account successfully
    Given I am on the Home Page
    And I click on bank manager login button
    And I click on customer button
    When I click on searched customer
    And I click select name "Hermoine"
    And I click on delete customer button
    Then I should delete customer successfully


