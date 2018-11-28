package Jeeng.appManager;

import Jeeng.testsJeeng.MyListener;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    public static final String HOST = "https://v3.dashboard.staging.jeeng.com/signin";
    SessionHelper sessionHelper;
    PushNotifications pushNotifications;

    EventFiringWebDriver driver;
    private String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void start() {

        if (browser.equals(BrowserType.CHROME)) {
            driver = new EventFiringWebDriver(new ChromeDriver());
        } else if (browser.equals(BrowserType.FIREFOX)) {
            driver = new EventFiringWebDriver(new FirefoxDriver());
        }
        driver.register(new MyListener());

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        sessionHelper = new SessionHelper(driver);
        pushNotifications = new PushNotifications(driver);
        sessionHelper.openSite(HOST);
        sessionHelper.login("demo@jeeng.com","demo2018");
        sessionHelper.clickToLogin();
    }

    public void stop() {
        driver.quit();
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }


    public PushNotifications getPushNotifications() {
        return pushNotifications;
    }
}
