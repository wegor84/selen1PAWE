import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GoogleMainPage;
import pages.ImagesResultPage;
import pages.SearchResultPage;
import test1.TestBase;

public class StepDefinitions extends TestBase {
    private GoogleMainPage mainPage;
    private SearchResultPage searchResultPage;
    private ImagesResultPage imagesResultPage;
    private Integer imageCount;

    @Given("I am on the Google main page")
    public void iAmOnTheGoogleMainPage() {
        mainPage = new GoogleMainPage();
    }

    @When("I click the reject everything button")
    public void iClickTheRejectEverythingButton() {
        mainPage.clickRejectEverythingButton();
    }

    @When("I search for {string}")
    public void iSearchFor(String searchText) {
        mainPage.searchForText(searchText);
    }

    @When("I go to images")
    public void iGoToImages() throws InterruptedException {
        searchResultPage = new SearchResultPage();
        searchResultPage.goToImages();
    }

    @Then("I should see image results")
    public void iShouldSeeImageResults() {
        imagesResultPage = new ImagesResultPage();
        imageCount = imagesResultPage.countImages();
        Assert.assertTrue(imageCount > 0);
    }

    @When("I click on image result number {int}")
    public void iClickOnImageResultNumber(int imageNumber) {
        imagesResultPage.clickOnImageResultNumber(imageNumber - 1);
    }

    @Then("I should see the enlarged image")
    public void iShouldSeeTheEnlargedImage() throws InterruptedException {
        Thread.sleep(10000);
        // Add assertion or additional validation here
    }
}
