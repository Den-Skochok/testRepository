package web.tests.AppManager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionHelper {


    ChromeDriver driver;
    public SessionHelper(ChromeDriver driver) {
        this.driver = driver;
    }

    public void login(String email, String password) {
        driver.findElement(By.id("login")).click();
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys(email);

        driver.findElement(By.id("pswd")).click();
        driver.findElement(By.id("pswd")).clear();
        driver.findElement(By.id("pswd")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id='app']/div[3]/div/main/form/div/div[5]/div[3]/button")).click();
    }
}
