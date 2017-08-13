Feature: Easyjet Registration

  @Reg
  Scenario: Verify Member Registration

    Given I entered url as "https://www.easyjet.com/en/register"
    And I enter "abcd99@gmail.com" email address
    And I enter "abcd99@gmail.com" as confirm email address
    And I enter "strike123" in password
    And I enter "strike123" as confirm password
    And I select "Mr" for title
    And I enter "John" as First Name
    And I enter "Lewis" as Surname
    And I enter "100 Piccadilly Circus" in Address
    And I enter " " in Address contd
    And I enter "London" in Town
    And I enter "E1 8JL" in Postcode
    And I enter "07788991122" as mobile number
    And I select the Optout checkbox
    When I click on Register Now button
    Then I should see "My account" details page


