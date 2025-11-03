package pages;

import com.codeborne.selenide.SelenideElement;
import helper.NavigationHelper;
import testdata.TestData;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.jupiter.api.Assertions.assertAll;

public class CareerFooterPage {
    NavigationHelper navigationHelper = new NavigationHelper();

    private final SelenideElement careerFooter = $(".FooterDark_root__78jjk");

    public final SelenideElement beIcon = careerFooter.$("a[href*='behance']");
    public final SelenideElement dpIcon = careerFooter.$("a[href*='dprofile']");
    public final SelenideElement tgIcon = careerFooter.$("a[href*='t.me']");
    public final SelenideElement vkIcon = careerFooter.$("a[href*='vk.com']");
    public final SelenideElement copyright = careerFooter.$("p.h4");
    public final SelenideElement creativeDigitalProductionFooterBanner = careerFooter.$(".copyrightsBig");
    public final SelenideElement privacyPolicyLink = careerFooter.$("a.text2");

    public void scrollToFooter() {
        careerFooter.scrollTo();
    }

    public void checkAllCareerFooterElements() {
        assertAll(
                () -> beIcon.shouldBe(visible)
                        .as("Иконка Behance должна быть видима на странице Карьера")
                        .shouldHave(text("be"))
                        .as("Иконка Behance должна содержать текст 'be' на странице Карьера"),

                () -> dpIcon.shouldBe(visible)
                        .as("Иконка DProfile должна быть видима на странице Карьера")
                        .shouldHave(text("dp"))
                        .as("Иконка DProfile должна содержать текст 'dp' на странице Карьера"),

                () -> tgIcon.shouldBe(visible)
                        .as("Иконка Telegram должна быть видима на странице Карьера")
                        .shouldHave(text("tg"))
                        .as("Иконка Telegram должна содержать текст 'tg' на странице Карьера"),

                () -> vkIcon.shouldBe(visible)
                        .as("Иконка VK должна быть видима на странице Карьера")
                        .shouldHave(text("vk"))
                        .as("Иконка VK должна содержать текст 'vk' на странице Карьера"),

                () -> copyright.shouldBe(visible)
                        .as("Копирайт должен быть видим на странице Карьера")
                        .shouldHave(text(TestData.EXPECTED_FOOTER_COPYRIGHT))
                        .as("Текст копирайта не соответствует ожидаемому на странице Карьера"),

                () -> creativeDigitalProductionFooterBanner.shouldBe(visible)
                        .as("Баннер 'Creative Digital Production' должен быть видим на странице Карьера")
                        .shouldHave(text(TestData.EXPECTED_CREATIVE_DIGITAL_PRODUCTION_FOOTER_BANNER))
                        .as("Текст баннера 'Creative Digital Production' не соответствует ожидаемому на странице Карьера"),

                () -> privacyPolicyLink.shouldBe(visible)
                        .as("Ссылка 'Политика конфиденциальности' должна быть видима на странице Карьера")
                        .shouldHave(text(TestData.EXPECTED_FOOTER_PRIVACY_LINK_TEXT))
                        .as("Текст ссылки 'Политика конфиденциальности' не соответствует ожидаемому на странице Карьера")
        );
    }
}