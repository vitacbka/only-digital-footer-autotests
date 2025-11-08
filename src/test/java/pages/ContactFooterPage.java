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
                        .as("Текст иконки Behance на странице Контакты не соответствует"),

                () -> dpIcon.shouldBe(visible)
                        .as("Иконка DProfile должна быть видима на странице Контакты")
                        .shouldHave(text("dp"))
                        .as("Текст иконки DProfile на странице Контакты не соответствует ожидаемому"),

                () -> tgIcon.shouldBe(visible)
                        .as("Иконка Telegram должна быть видима на странице Контакты")
                        .shouldHave(text("tg"))
                        .as("Текст иконки Telegram на странице Контакты не соответствует ожидаемому "),

                () -> vkIcon.shouldBe(visible)
                        .as("Иконка VK должна быть видима на странице Контакты")
                        .shouldHave(text("vk"))
                        .as("Текст иконки VK на странице Контакты не соответствует ожидаемому"),

                () -> copyright.shouldBe(visible)
                        .as("Копирайт должен быть видим на странице Контакты")
                        .shouldHave(text(TestData.EXPECTED_FOOTER_COPYRIGHT))
                        .as("Текст копирайта на странице Контакты не соответствует ожидаемому"),

                () -> creativeDigitalProductionFooterBanner.shouldBe(visible)
                        .as("Баннер 'Creative Digital Production' должен быть видим на странице Контакты")
                        .shouldHave(text(TestData.EXPECTED_CREATIVE_DIGITAL_PRODUCTION_FOOTER_BANNER))
                        .as("Текст баннера 'Creative Digital Production' на странице Контакты не соответствует ожидаемому"),

                () -> privacyPolicyLink.shouldBe(visible)
                        .as("Ссылка 'Политика конфиденциальности' должна быть видима на странице Контакты")
                        .shouldHave(text(TestData.EXPECTED_FOOTER_PRIVACY_LINK_TEXT))
                        .as("Текст ссылки 'Политика конфиденциальности' на странице Контакты не соответствует ожидаемому")
        );
    }
}