package Jeeng.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {
    
    public SessionHelper(WebDriver driver) {
        super(driver);
    }

    public void login(String mail, String password) {
        type(By.xpath("//input[@type='text']"), mail);
        type(By.xpath("//input[@type='password']"), password);
    }

    public void openSite(String url) {
        driver.navigate().to(url);
    }

    public void clickToLogin() {
        click(By.xpath("//div[@class='v-btn__content']"));
    }


}
