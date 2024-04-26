Feature: Login to MarAir webpage

  Background:
    Given user is on MarAir homepage

  Scenario Outline: Basic booking flow with departure time and return time
    When user selects departure time is "<departure>"
    And user selects returning time is "<return>"
    Then user clicks on search
    And user get result for the flight is "<result>"
    Examples: With information as following
      | departure | return                        | result                                    |
      | July      | December (two years from now) | Seats available!                          |
      | July      | December (next year)          | Sorry, there are no more seats available. |


  Scenario Outline: To check status of promotional code
    When user selects departure time is "<departure>"
    And user selects returning time is "<return>"
    And user adds promotional code is "<promotional_code>"
    Then user clicks on search
    And user get status of the promotional code is "<promotional_status>"
    Examples: With information as following
      | departure | return                        | promotional_code  | promotional_status                              |
      | July      | December (two years from now) |      AF3-FJK-418  | Promotional code AF3-FJK-418 used: 30% discount! |
      | July      | December (two years from now) |      AF3-FJK-411  | Sorry, code AF3-FJK-411 is not valid            |

