package pages;

import com.codeborne.selenide.SelenideElement;
import testdata.TestData;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.jupiter.api.Assertions.assertAll;

public class ContactFooterPage {

    public final SelenideElement contactFooter = $(".FooterDark_root__78jjk");

    public final SelenideElement beIcon = contactFooter.$("a[href*='behance']");
    public final SelenideElement dpIcon = contactFooter.$("a[href*='dprofile']");
    public final SelenideElement tgIcon = contactFooter.$("a[href*='t.me']");
    public final SelenideElement vkIcon = contactFooter.$("a[href*='vk.com']");
    public final SelenideElement copyright = contactFooter.$("p.h4");
    public final SelenideElement creativeDigitalProductionFooterBanner = contactFooter.$(".copyrightsBig");
    public final SelenideElement privacyPolicyLink = contactFooter.$("a.text2");

    public void scrollToFooter() {
        contactFooter.scrollTo();
    }

    public void checkAllContactFooterPage() {
        assertAll(
                () -> beIcon.shouldBe(visible)
                        .as("Иконка Behance должна быть видима на странице Контакты")
                        .shouldHave(text("be"))
                        .as("Иконка Behance должна содержать текст 'be' на странице Контакты"),

                () -> dpIcon.shouldBe(visible)
                        .as("Иконка DProfile должна быть видима на странице Контакты")
                        .shouldHave(text("dp"))
                        .as("Иконка DProfile должна содержать текст 'dp' на странице Контакты"),

                () -> tgIcon.shouldBe(visible)
                        .as("Иконка Telegram должна быть видима на странице Контакты")
                        .shouldHave(text("tg"))
                        .as("Иконка Telegram должна содержать текст 'tg' на странице Контакты"),

                () -> vkIcon.shouldBe(visible)
                        .as("Иконка VK должна быть видима на странице Контакты")
                        .shouldHave(text("vk"))
                        .as("Иконка VK должна содержать текст 'vk' на странице Контакты"),

                () -> copyright.shouldBe(visible)
                        .as("Копирайт должен быть видим на странице Контакты")
                        .shouldHave(text(TestData.EXPECTED_FOOTER_COPYRIGHT))
                        .as("Текст копирайта не соответствует ожидаемому на странице Контакты"),

                () -> creativeDigitalProductionFooterBanner.shouldBe(visible)
                        .as("Баннер 'Creative Digital Production' должен быть видим на странице Контакты")
                        .shouldHave(text(TestData.EXPECTED_CREATIVE_DIGITAL_PRODUCTION_FOOTER_BANNER))
                        .as("Текст баннера 'Creative Digital Production' не соответствует ожидаемому на странице Контакты"),

                () -> privacyPolicyLink.shouldBe(visible)
                        .as("Ссылка 'Политика конфиденциальности' должна быть видима на странице Контакты")
                        .shouldHave(text(TestData.EXPECTED_FOOTER_PRIVACY_LINK_TEXT))
                        .as("Текст ссылки 'Политика конфиденциальности' не соответствует ожидаемому на странице Контакты")
        );
    }
}