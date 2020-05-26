@devs2
Feature: User buy a sweater

  Scenario Outline: User is logging in and buy a sweater
    Given User is on the mainpage and clicks SignIn
    When User is logging in to the shop with valid data
    When User is adding a sweater to the cart: size <size>, quantity <quantity>
    When User click proceed to checkout
    When User proceed the order
    Then User makes a screenshot of a webpage

    Examples:
      | size | quantity |
      | M    | 5        |