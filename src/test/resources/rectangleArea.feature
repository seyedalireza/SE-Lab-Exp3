@tag
Feature:Rectangle Area Calculator
  Scenario: Compute area of rectangle
    Given height and width of rectangle, 1 and 2
    When I calculate area of rectangle
    Then I expect the result 2

  Scenario Outline: add two numbers
    Given height and width of rectangle, <first> and <second>
    When I calculate area of rectangle
    Then I expect the result <result>
    Examples:
      | first | second | result |
      | 1     | 12     | 12     |
      | 5    | 6      | 30      |
      | 2     | 2      | 4      |
