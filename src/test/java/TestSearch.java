import org.junit.Test;
import test1.TestBase;

public class TestSearch extends TestBase {





    @Test
    public void shouldSearchForImagesOnGoogle() throws InterruptedException {

        mainPage.clickRejectEverythingButton();
        mainPage.searchForText("PKO");
        searchResultPage.goToImages();
        System.out.println("ilosc to jest = "+imagesResultPage.countImages());
       imagesResultPage.clickOnImageResultNumber(3);
      Thread.sleep(10000);

    }


}
