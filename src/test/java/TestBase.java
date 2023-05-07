import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pages.GoogleMainPage;
import pages.ImagesResultPage;
import pages.SearchResultPage;

import java.util.List;

public class TestBase {
    WebDriver driver;
    String BASE_URL = "https://google.com";
    GoogleMainPage mainPage ;
    SearchResultPage searchResultPage;
    ImagesResultPage imagesResultPage;

    @Before
    public void setup() {
        System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver");

        //System.setProperty( "webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new FirefoxDriver();
       // driver = new ChromeDriver();
        mainPage = PageFactory.initElements(driver, GoogleMainPage.class);
        searchResultPage = PageFactory.initElements(driver, SearchResultPage.class);
        imagesResultPage = PageFactory.initElements(driver, ImagesResultPage.class);
        driver.get(BASE_URL);

    }

//    public void waitTo3sek(List list)
//    {
//        for ( int i =30; i > 0;i--){
//            System.out.println("i wynosi " +i);
//            Thread.sleep(100);
//            if (list.size() == 1) i = 0;
//        }
//    }

    @After
    public void tearDown(){
        driver.quit();
    }


}
