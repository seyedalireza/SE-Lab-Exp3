@tag
Feature:Rectangle Area Calculator
  Scenario: Compute area of rectangle
    Given height and width of rectangle, 1 and 2
    When I calculate area of rectangle
    Then I expect the result 2

  Scenario Outline: add two numbers
    Given height and width of rectangle, <height> and <width>
    When I calculate area of rectangle
    Then I expect the result <area>
    Examples:
      | height | width | area |
      | 1     | 12     | 12     |
      | 5    | 6      | 30      |
      | 2     | 2      | 4      |


  Scenario: Changing width and height of rectangle
    Given height and width of rectangle, 1 and 2
    When change height to 2 and width to 3 then compute area
    Then I expect the result 6

  Scenario Outline: add two numbers
    Given height and width of rectangle, <height> and <width>
    When change height to <new_height> and width to <new_width> then compute area
    Then I expect the result <area>
    Examples:
      | height | width | new_height | new_width | area |
      | 1     | 12     | 2 | 4 | 8     |
      | 5    | 6      | 3 | 6 | 18      |
      | 2     | 2      | 5 | 9 | 45      |