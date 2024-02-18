package poc.selenide.popup;

import static com.codeborne.selenide.Selenide.$;

public class PopupDialog {
    public static void acceptCookies() {
        $(PopupLocators.CookieOk).click();
    }
}
