package web.tests.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import web.tests.AppManager.ApplicationManager;

public class TestBase {

    protected final ApplicationManager applicationManager = new ApplicationManager();

    @BeforeMethod
    public void setUp(){
        applicationManager.init();
    }


    @AfterMethod
    public void close(){
        applicationManager.stop();
    }
}
