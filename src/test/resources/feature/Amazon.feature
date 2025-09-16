Feature: Validating Login functionalities and order a product in Amazon

  Scenario Outline: Login into Amazon and order a book
    Given I launch the amazon website
    When I select the Books link
    And I select the children's Book
    And I select the Book by the Book's name "<bookName>"
    And I click on search button
    And I click on the Book "<bookName>"
    And I select the required quantity <quantity>
    And I verify that <quantity> I need and the <quantity> got selected is same
    And I click on Add to cart button
    And I click on proceed to buy item button
    And I enter mobile number "<mobileNumber>" in enter mobile number or email field
    And I click on continue
    And I enter the password "<password>"
    Then I enter into secure checkout page

    Examples:
      | bookName          | quantity | mobileNumber | password   |
      | Harry Potter      | 2        | 9876543210   | Test@12345 |
      | Alice in Wonderland | 1      | 9123456789   | Pass@123   |
