package pages;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CookieBannerPage {

    private final SelenideElement cookieBanner = $("div.Cookie_root__eNa_a");
    private final SelenideElement okButton = $("button.Cookie_rootButton__38Z2N");

    public void acceptCookiesIfVisible() {
        if (cookieBanner.is(visible, Duration.ofSeconds(7))) {
            okButton.shouldBe(visible).click();
            cookieBanner.shouldNotBe(visible);
        }
    }
}
