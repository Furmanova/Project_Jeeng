package Jeeng.TestsJeeng;

import org.testng.annotations.Test;

public class Login extends TestBase {
    @Test
    public void loginTest()  {
        app.getSessionHelper().login("demo@jeeng.com","demo2018");
        app.getSessionHelper().clickToLogin();
    }
}
