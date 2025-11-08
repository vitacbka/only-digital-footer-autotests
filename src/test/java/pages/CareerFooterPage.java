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
                        .as("Иконка Behance в футере на странице 'Карьера' должна быть видимой")
                        .shouldHave(text("be")
                                .because("Текст иконки Behance в футере не соответствует описанию")),

                () -> dpIcon.shouldBe(visible)
                        .as("Иконка DProfile в футере на странице 'Карьера' должна быть видимой")
                        .shouldHave(text("dp")
                                .because("Текст иконки DProfile в футере не соответствует описанию")),

                () -> tgIcon.shouldBe(visible)
                        .as("Иконка Telegram в футере на странице 'Карьера' должна быть видимой")
                        .shouldHave(text("tg")
                                .because("Текст иконки Telegram в футере не соответствует описанию")),

                () -> vkIcon.shouldBe(visible)
                        .as("Иконка VK в футере на странице 'Карьера' должна быть видимой на странице 'Карьера' должна быть видимой")
                        .shouldHave(text("vk")
                                .because("Текст иконки VK в футере не соответствует описанию")),

                () -> copyright.shouldBe(visible)
                        .as("Копирайт в футере на странице 'Карьера' должен быть видим")
                        .shouldHave(text(TestData.EXPECTED_FOOTER_COPYRIGHT)
                                .because("Текст копирайта в футере на странице 'Карьера' не соответствует ожидаемому")),

                () -> creativeDigitalProductionFooterBanner.shouldBe(visible)
                        .as("Баннер 'Creative Digital Production' в футере на странице 'Карьера' должна быть видимой")
                        .shouldHave(text(TestData.EXPECTED_CREATIVE_DIGITAL_PRODUCTION_FOOTER_BANNER)
                                .because("Текст баннера 'Creative Digital Production' в футере не соответствует ожидаемому")),

                () -> privacyPolicyLink.shouldBe(visible)
                        .as("Ссылка 'Политика конфиденциальности' в футере на странице 'Карьера' должна быть видима")
                        .shouldHave(text(TestData.EXPECTED_FOOTER_PRIVACY_LINK_TEXT)
                                .because("Текст ссылки 'Политика конфиденциальности' в футере на странице 'Карьера' не соответствует ожидаемому"))
        );
    }
}