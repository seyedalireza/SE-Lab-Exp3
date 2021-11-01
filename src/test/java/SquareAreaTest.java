import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SquareAreaTest {

    private Square square;
    private int result;

    @Given("^side of Square, (\\d+)$")
    public void sideOfSquare(int side) {
        square = new Square(side);
    }

    @When("^I calculate area of Square$")
    public void iCalculateAreaOfSquare() {
        result = square.computeArea();
    }

    @Then("^I expect the area (\\d+)$")
    public void iExpectTheArea(int area) {
        Assert.assertEquals(area, result);
    }
}
