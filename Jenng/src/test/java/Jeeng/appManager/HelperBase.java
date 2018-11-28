package Jeeng.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperBase {
    public WebDriver driver;
    public Select select;

    public HelperBase(WebDriver driver) {
        this.driver = driver;
    }


    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void advancedClick(By locator) {
        WebElement element = driver.findElement(locator);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }

    public void type(By locator, String text) {
        type(locator, text, true);
    }

    public void type(By locator, String text, Boolean clear) {
        if (text != null) {
            click(locator);
            if (clear) {
                driver.findElement(locator).clear();
            }
            driver.findElement(locator).sendKeys(text);
        }
    }

    public boolean isElementPresent(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
    public Select getSelect(WebElement element) {
        select = new Select(element);
        return select;
    }
    public void waitUntilIsLoadedCustomTime(WebElement element) {
        waitUntilIsLoadedCustomTime(element,30);
    }

    public void waitUntilIsLoadedCustomTime(WebElement element, int time) {
        try {
            new WebDriverWait(driver, time).until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
