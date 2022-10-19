package web.tests.AppManager;

import org.openqa.selenium.chrome.ChromeDriver;
import web.tests.model.Page;

public class NavigationHelper {

    ChromeDriver driver;

    public NavigationHelper(ChromeDriver driver) {
        this.driver = driver;
    }

    public void goToPage(Page page) throws InterruptedException {
        driver.get(page.getLink());
        Thread.sleep(5000);

    }
}
