package Jeeng.testsJeeng;

import Jeeng.appManager.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

public class TestBase extends MyListener{
    public static ApplicationManager app = new ApplicationManager(System.getProperty("browser", BrowserType.CHROME));
    @BeforeMethod
    public void logTestStart(Method method) {
        logger.info("Start test" + method.getName());
    }
    @AfterMethod(alwaysRun = true)
    public void logTestStop(Method method){
        logger.info("Stop test" + method.getName());
    }

    @BeforeMethod
    public void setUp() {
        app.start();
    }

    /*@AfterMethod(alwaysRun = true)
    public void tearDown() {
        app.stop();
    }*/
}
