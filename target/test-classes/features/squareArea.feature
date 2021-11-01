@tag
Feature:Square Area Calculator
  Scenario: Compute area of Square
    Given side of Square, 2
    When I calculate area of Square
    Then I expect the area 4

  Scenario Outline: Compute area of Square
    Given side of Square, <side>
    When I calculate area of Square
    Then I expect the area <area>
    Examples:
      | side | area |
      | 8   | 64     |
      | 5   | 25      |
      | 2   | 4      |
