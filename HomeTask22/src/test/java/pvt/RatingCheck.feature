Feature: Test Rating Check

  Scenario: Check hotels for selected dates
    Given I am on page with "https://www.booking.com" url
    When I enter the "Москва" city
    When I see the date selection window
    When I press the search button
    Then I see hotels

  Scenario: Hotel rating check
    Given I am on page with "https://www.booking.com" url
    When I enter the "Москва" city
    When I see the date selection window
    When I press the search button
    When I choose a rating
    When I open the page with the first hotel
    Then I check the rating

