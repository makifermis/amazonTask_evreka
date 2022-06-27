Feature:Amazon search functionality
  User Story:
  As a user, I should be able search Iphone at amazon.com and log the result.

  Scenario: Search "Iphone13 512"
    Given User is at amazon main page
    When User search "iPhone13 512"
    And User can see the results are listed
    And User clicks iPhone13 at the top of the list
    Then User log the phone information
