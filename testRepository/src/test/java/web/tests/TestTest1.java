package web.tests;

import org.testng.annotations.Test;

public class TestTest1 extends TestBase {


    @Test
    public void quickPreviewTest() throws InterruptedException {
        selectDocOrDG();
        clickOnQuickPreviewInRightSideBar();
        Thread.sleep(5000);
    }

}
