Feature:Login into Book Store by giving Credentials

  Scenario: Login into Book Store and select a Book.
    Given I access the Books Webpage
    When I enter a UserName and password
    And I click on login button
    Then I should be able to login successfully
    And  I can select the book