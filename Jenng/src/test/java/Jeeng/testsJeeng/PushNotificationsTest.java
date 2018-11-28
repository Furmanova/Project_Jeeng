package Jeeng.testsJeeng;

import Jeeng.appManager.PushNotifications;

import org.testng.annotations.Test;

public class PushNotificationsTest extends TestBase {
    @Test
    public void testPushNotifications() {
        PushNotifications helper = app.getPushNotifications();
        helper.goToThePushNotificationsPage();
        helper.selectNews();



    }
}
