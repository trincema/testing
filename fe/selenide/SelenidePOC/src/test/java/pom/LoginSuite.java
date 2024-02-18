package pom;

import org.junit.jupiter.api.*;
import poc.selenide.login.LoginPage;
import poc.selenide.testdata.LoginTestData;

public class LoginSuite {
    @Test
    public void userCanLoginByUsername() {
        LoginPage page = new LoginPage();
        page.open();
        page.login(LoginTestData.username, LoginTestData.username);
        try {
            Thread.sleep(10000000);
        } catch (InterruptedException e) {}
    }
}
