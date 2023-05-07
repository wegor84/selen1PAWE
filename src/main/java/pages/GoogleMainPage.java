package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleMainPage {

    @FindBy(xpath = "//*[@id=\"W0wltc\"]/div")
    WebElement rejectEverythingButton;

    @FindBy(name = "q")
    WebElement searchInput;

    public void clickRejectEverythingButton(){
        rejectEverythingButton.click();

    }

    public void searchForText(String text){
        searchInput.sendKeys(text);
        searchInput.submit();
    }
}

