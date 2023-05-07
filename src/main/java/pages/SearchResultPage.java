package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;

public class SearchResultPage extends PageBase{
    @FindBy(linkText = "Grafika")
    WebElement imagesLink;

    @FindBy(xpath = "//*[@id='fsl']/a[1]")
    List <WebElement> pomoc;


    public void goToImages() throws InterruptedException {

//        for ( int i =30; i > 0;i--){
//            System.out.println("i wynosi " +i);
//            Thread.sleep(100);
//            if (pomoc.size() == 1) i = 0;
//        }
//        imagesLink.click();

        if (waitTo3sek(pomoc)) {
            imagesLink.click();
        }

    }
}
