package Jeeng.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PushNotifications extends HelperBase {
    public PushNotifications(WebDriver driver) {
        super(driver);
    }

    public PushNotifications goToThePushNotificationsPage() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        advancedClick(By.xpath("//div[contains(text(),'Push Notifications')]"));
        return this;
    }
    public PushNotifications selectNews(){
        advancedClick(By.xpath("//div[@class='layout row wrap']//div[3]//div[1]//div[1]//div[1]//div[1]//div[1]//div[3]"));
        advancedClick(By.xpath("//span[contains(text(),'Browser')]"));
        //advancedClick(By.xpath("//span[contains(text(),'Mobile')]"));
       // advancedClick(By.xpath("//span[contains(text(),'Facebook')]"));
        //advancedClick(By.xpath("//div[@class='v-radio theme--light white--text']//div[@class='flex']")); //mail
       // advancedClick(By.xpath("//div[@class='v-input front-label v-input--selection-controls v-input--switch theme--light']//div[@class='v-input--selection-controls__ripple']"));//ON Send To All Users
       // advancedClick(By.xpath("//div[@class='v-input front-label v-input--selection-controls v-input--switch theme--light']//div[@class='v-input--switch__track theme--light']"));//OFF Send To All Users
        advancedClick(By.xpath("//div[@class='v-select__selections']//span[3]//span[1]//div[1]//i[1]"));//delete
       advancedClick(By.xpath("//span[contains(text(),'SEND NOW')]"));//
        return this;
    }
}
