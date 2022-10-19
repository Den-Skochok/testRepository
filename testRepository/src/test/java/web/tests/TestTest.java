package web.tests;

import org.testng.annotations.Test;

public class TestTest extends TestBase {

    @Test
    public void goToPageTests() throws InterruptedException {
        goToPage(new Page("https://app3.signnow-dev.xyz/webapp/documents/1757a5bdff0042bf8ebc67b617f9106a0e0a3cb6"));
    }


}
