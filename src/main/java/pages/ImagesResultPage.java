package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ImagesResultPage {

    @FindBy(xpath ="//*[@id='islrg']/div[1]/div/a/div/img")
    List <WebElement> imageContainer;

    public Integer countImages(){
        return imageContainer.size();
    }

    public void clickOnImageResultNumber(Integer numberOfResult){
        imageContainer.get(numberOfResult).click();
    }

}
