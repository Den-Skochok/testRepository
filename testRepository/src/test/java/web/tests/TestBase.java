package web.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    ChromeDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/denys/Desktop/testCursor/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.get("https://app3.signnow-dev.xyz/");
        login("skochok.denys+379@airslate.com", "123456");

        driver.findElement(By.xpath("//*[@id='app']/div[3]/div/main/form/div/div[5]/div[3]/button")).click();
    }

    private void login(String email, String password) {
        driver.findElement(By.id("login")).click();
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys(email);

        driver.findElement(By.id("pswd")).click();
        driver.findElement(By.id("pswd")).clear();
        driver.findElement(By.id("pswd")).sendKeys(password);
    }

    protected void goToPage(Page page) throws InterruptedException {
        driver.get(page.getLink());
        Thread.sleep(5000);

    }


    @AfterMethod
    public void close(){
        driver.quit();
    }

    protected void selectDocOrDG() {
        clickOnQuickPreviewInRightSideBar();
    }

    protected void clickOnQuickPreviewInRightSideBar() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/div[2]/div/div/main/div/div/div[1]/div/div[2]/div[1]/div/div[1]/label/span")).click();
    }
}
