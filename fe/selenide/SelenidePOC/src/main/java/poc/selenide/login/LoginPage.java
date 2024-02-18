package poc.selenide.login;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import poc.selenide.popup.PopupDialog;
import poc.selenide.testdata.LoginTestData;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.SetValueOptions.withText;

public class LoginPage {

    public void open() {
        Selenide.open(LoginLocators.Url);
    }

    public void login(final String username, final String password) {
        $(By.cssSelector(LoginLocators.UsernameField)).setValue(username);
        $(By.cssSelector(LoginLocators.PasswordField)).setValue(withText(password).sensitive());
        $(By.cssSelector(LoginLocators.PasswordField)).shouldHave(text(LoginTestData.password), Duration.ofSeconds(5));
        PopupDialog.acceptCookies();
        $(By.cssSelector(LoginLocators.Submit)).click();
    }
}