package web.tests.AppManager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DocListHelper {
    ChromeDriver driver;

    public DocListHelper(ChromeDriver driver) {
        this.driver = driver;
    }

    public void selectDocOrDG() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/div[2]/div/div/main/div/div/div[1]/div/div[2]/div[1]/div/div[1]/label/span")).click();
    }
}
