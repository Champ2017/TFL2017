Feature: Easyjet Sign In

  Scenario: Verify Sign In with valid credentials

    Given I entered url "https://www.easyjet.com/en/"
    And I accept the cookies
    And I click on Sign In link
    And I enter "testqa13@hotmail.com" as email address
    And I enter "Password123" as password
    When I click on Sign In button
#    Then I should see "My bookings" page

