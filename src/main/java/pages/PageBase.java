package pages;

import org.openqa.selenium.WebElement;

import java.util.List;

public class PageBase {

    protected boolean waitTo3sek(List<WebElement> list) throws InterruptedException {
        for (int i = 30; i > 0; i--) {
            System.out.println("i wynosi " + i);
            Thread.sleep(100);
            if (list.size() == 1)
                return true;
        }
        return false;
    }
}
