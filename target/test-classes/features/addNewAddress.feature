@devs

Feature: User adds new address

  Scenario Outline: User is logging in and add new address
    Given User is on the mainpage and clicks SignIn
    When User is logging in to the shop with valid data
    When User is adding new address with proper data: alias <alias>, addresses <address>, zipcode <zipcode>, city <city>
    And User is checking whether given data has been filled correctly
    And User deletes the added address
    Examples:
      | alias      | address            | zipcode | city    |
      | CASAnova   | Kalwaryjska Street | 56-789  | Cracow  |
#


