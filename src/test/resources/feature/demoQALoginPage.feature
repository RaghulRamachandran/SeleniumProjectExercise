Feature: Login Into Demo QA Page

  Scenario:Validate successful Login into book store
  Given I access the Demo QA login Page
  When I enter a UserName and password
  And I click on login button
  Then I should be able to login successfully
  And I verify that the text contains the expecteduserName "{}"