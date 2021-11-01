import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RectangleAreaTest {

    private Rectangle rectangle;
    private int result;

    @Given("^height and width of rectangle, (\\d+) and (\\d+)$")
    public void heightAndWidthOfRectangleAnd(int height, int width) {
        rectangle = new Rectangle(height, width);
    }

    @When("^I calculate area of rectangle$")
    public void iCalculateAreaOfRectangle() {
        result = rectangle.computeArea();
    }

    @Then("^I expect the result (\\d+)$")
    public void iExpectTheResult(int expectedResult) {
        assertEquals(expectedResult, result);
    }

    @When("^change height to (\\d+) and width to (\\d+) then compute area$")
    public void changeHeightToAndWidthToThenComputeArea(int height, int width) {
        rectangle.setHeight(height);
        rectangle.setWidth(width);
        result = rectangle.computeArea();
    }
}
