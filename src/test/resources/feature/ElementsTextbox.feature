Feature: To Populate the required information for TextBox

  Scenario: Validate required details have been populated for TextBox Page

    Given I access the page for Text Box
    When I enter the details for the required fields
    And I click on submit
    Then I should get the details I given in a box