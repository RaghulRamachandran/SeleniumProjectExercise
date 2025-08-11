Feature: Practice Form Submission

  Scenario Outline: Fill practice form
    Given I open the practice form
    And I enter first name "<firstname>"
    And I enter last name "<lastname>"
    And I enter email "<email>"
    And I select gender "<gender>"
    And I enter mobile number "<mobile>"
    And I select date of birth "<day>" "<month>" "<year>"
    And I enter subjects "<subjects>"
    And I select hobbies "<hobbies>"
    And I upload picture "<picture>"
    And I enter current address "<address>"
    And I select state "<state>"
    And I select city "<city>"
    Then I click the submit button

    @Test1
    Examples:
      | firstname | lastname | email            | gender | mobile     | day | month  | year | subjects | hobbies | picture                                                                 | address         | state | city  |
      | John      | Doe      | john@example.com | Male   | 9876543210 | 02  | August | 1998 | Maths    | Sports  | C:\Users\rai24\OneDrive - Sky\Pictures\Screenshots\Screenshot (1).png | 123 Street Name | NCR   | Delhi |

    @Test2
    Examples:
      | firstname | lastname | email            | gender | mobile     | day | month  | year | subjects | hobbies | picture                                                                 | address         | state | city  |
      | Alice     | Smith    | alice@example.com  | Female | 9876543211 | 15  | June    | 2000 | English  | Reading | C:\Users\rai24\OneDrive - Sky\Pictures\Screenshots\Screenshot (2).png  | 456 Another Road | Haryana | Karnal|
