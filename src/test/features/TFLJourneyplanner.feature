@TFL
Feature: TFL Plan a journey

  @One
  Scenario Outline: Verify TFL Journey results
    Given I enter url "https://tfl.gov.uk/"
    And I enter "<From>" in the From field
    And I enter "<To>" in the To field
    When I click on Plan My Journey button
    Then I should see "JOURNEY RESULTS" page
    And I should see "<From>"
    And I should see "<To>" in destination
    And I should see "Edit journey" link
    And I should see "Travel preferences & accessibility:" text
    And I should see "Edit preferences" hyperlink
    And the url should contain the text "https://tfl.gov.uk/plan-a-journey/results?"


    Examples:
      |From            |To            |
      |London Bridge   |Waterloo      |
#      |Waterloo        |Canary Wharf  |
#      |Canary Wharf    |Waterloo      |


  @TWO2
  Scenario Outline: TFL Journey Edit preferences
    Given I enter the url
    And I enter "<from>" as the starting location
#    And I enter "<to>" as the destination
#    And I open the edit preferences link
#    And I select "Routes with fewest changes" option under Show me
#    And I select "Full step-free access" option under Access options
#    And I select "Search outside London" check box
#    And I select "Save these preferences for future visits" checkbox
#    When I click Plan My Journey button
#    Then I should see "View Details" button
#    And I should see  "Earlier journeys"
#    And I see "Later journeys" link
#    And I see "Cycling and other options"
#
    Examples:
      |from          |to       |
      |London Bridge |Waterloo |







