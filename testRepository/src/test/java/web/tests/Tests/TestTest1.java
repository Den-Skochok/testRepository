package web.tests.Tests;

import org.testng.annotations.Test;

public class TestTest1 extends TestBase {


    @Test
    public void quickPreviewTest() throws InterruptedException {
        applicationManager.getDocListHelper().selectDocOrDG();
        applicationManager.rightSideBarHelper().clickOnQuickPreviewInRightSideBar();
        Thread.sleep(5000);
    }

}
