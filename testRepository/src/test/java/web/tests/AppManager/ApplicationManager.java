package web.tests.AppManager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    ChromeDriver driver;
    private DocListHelper docListHelper;
    private NavigationHelper navigationHelper;
    private SessionHelper sessionHelper;
    private RightSideBarHelper rightSideBarHelper;

    public void init() {
        System.setProperty("webdriver.chrome.driver", "/Users/denys/Desktop/testCursor/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        navigationHelper = new NavigationHelper(driver);
        docListHelper = new DocListHelper(driver);
        sessionHelper = new SessionHelper(driver);
        rightSideBarHelper = new RightSideBarHelper(driver);

        docListHelper.driver.get("https://app3.signnow-dev.xyz/");
        sessionHelper.login("skochok.denys+379@airslate.com", "123456");
    }

    public void stop() {
        driver.quit();
    }



    public NavigationHelper getPageNavigationHelper() {
        return navigationHelper;
    }

    public DocListHelper getDocListHelper() {
        return docListHelper;
    }

    public SessionHelper sessionHelper() {
        return sessionHelper;
    }
    public RightSideBarHelper rightSideBarHelper() {
        return rightSideBarHelper;
    }
}
