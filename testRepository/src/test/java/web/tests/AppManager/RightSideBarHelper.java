package web.tests.AppManager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightSideBarHelper {
    private ChromeDriver driver;

    public RightSideBarHelper(ChromeDriver driver) {

        this.driver = driver;
    }

    public void clickOnQuickPreviewInRightSideBar() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/div[2]/div/div/main/div/div/div[2]/div/div[2]/div/div/div[3]/ul/li[5]/button")).click();
    }
}
