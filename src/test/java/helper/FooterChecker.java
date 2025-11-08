package helper;

import pages.FooterPage;
import testdata.TestData;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class FooterChecker {

    private final FooterPage footerPage = new FooterPage();
    private String currentPageName = "";

    public void setPageName(String pageName) {
        this.currentPageName = pageName;
    }

    public void checkAllFooterElements() {
        footerPage.startProjectButton.shouldBe(visible)
                .as("Кнопка 'Начать проект' должна быть видима")
                .shouldHave(text(TestData.EXPECTED_FOOTER_START_PROJECT_BUTTON_TEXT)
                        .because(String.format("Текст кнопки 'Начать проект' в футере на странице '%s' не соответствует ожидаемому", currentPageName)));

        footerPage.behanceIcon.shouldBe(visible)
                .as("Иконка Behance должна быть видима")
                .shouldHave(text("be")
                        .because(String.format("Текст иконки Be в футере на странице '%s' не соответствует ожидаемому", currentPageName)));

        footerPage.dprofileIcon.shouldBe(visible)
                .as("Иконка DProfile должна быть видима")
                .shouldHave(text("dp")
                        .because(String.format("Текст иконки DP в футере на странице '%s' не соответствует ожидаемому", currentPageName)));

        footerPage.telegramIcon.shouldBe(visible)
                .as("Иконка Telegram должна быть видима")
                .shouldHave(text("tg")
                        .because(String.format("Текст иконки Telegram в футере на странице '%s' не соответствует ожидаемому", currentPageName)));

        footerPage.vkIcon.shouldBe(visible)
                .as("Иконка VK должна быть видима")
                .shouldHave(text("vk")
                        .because(String.format("Текст иконки VK в футере на странице '%s' не соответствует ожидаемому", currentPageName)));

        footerPage.copyright.shouldBe(visible)
                .as("Копирайт должен быть видим")
                .shouldHave(text(TestData.EXPECTED_FOOTER_COPYRIGHT)
                        .because(String.format("Текст копирайта в футере на странице '%s' не соответствует ожидаемому", currentPageName)));

        footerPage.footerLogo.shouldBe(visible)
                .as("Логотип в футере должен быть видим");

        footerPage.footerSlogan.shouldBe(visible)
                .as("Слоган в футере должен быть видим")
                .shouldHave(text(TestData.EXPECTED_FOOTER_SLOGAN_TEXT)
                        .because(String.format("Текст слогана в футере на странице '%s' не соответствует ожидаемому", currentPageName)));

        footerPage.emailLink.shouldBe(visible)
                .as("Ссылка email должна быть видима")
                .shouldHave(text(TestData.EXPECTED_FOOTER_EMAIL_TEXT)
                        .because(String.format("Адрес email ссылки в футере на странице '%s' не соответствует ожидаемому", currentPageName)));

        footerPage.phoneText.shouldBe(visible)
                .as("Текст телефона должен быть видим")
                .shouldHave(text(TestData.EXPECTED_FOOTER_PHONE_TEXT)
                        .because(String.format("Номер телефона в футере на странице '%s' не соответствует ожидаемому", currentPageName)));

        footerPage.telegramForCommunicationText.shouldBe(visible)
                .as("Текст 'Telegram для связи' должен быть видим")
                .shouldHave(text(TestData.EXPECTED_TELEGRAM_FOR_COMMUNICATION_TEXT)
                        .because(String.format("Текст 'Telegram для связи' в футере на странице '%s' не соответствует ожидаемому", currentPageName)));

        footerPage.telegramUsernameLink.shouldBe(visible)
                .as("Ссылка telegram username не отображается")
                .shouldHave(text(TestData.EXPECTED_FOOTER_TELEGRAM_TEXT)
                        .because(String.format("Текст ссылки Telegram в футере на странице '%s' не соответствует ожидаемому", currentPageName)));

        footerPage.pdfButton.shouldBe(visible)
                .as("Кнопка PDF должна быть видима")
                .shouldHave(text("pdf")
                        .because(String.format("Текст кнопки PDF в футере на странице '%s' не соответствует ожидаемому", currentPageName)));

        footerPage.pitchLink.shouldBe(visible)
                .as("Ссылка Pitch должна быть видима")
                .shouldHave(text("pitch")
                        .because(String.format("Текст ссылки Pitch в футере на странице '%s' не соответствует ожидаемому", currentPageName)));

        footerPage.privacyPolicyLink.shouldBe(visible)
                .as("Ссылка 'Политика конфиденциальности' должна быть видима")
                .shouldHave(text(TestData.EXPECTED_FOOTER_PRIVACY_LINK_TEXT)
                        .because(String.format("Текст ссылки 'Политика конфиденциальности' в футере на странице '%s' не соответствует ожидаемому", currentPageName)));

        footerPage.creativeDigitalProductionFooterBanner.shouldBe(visible)
                .as("Баннер 'Creative Digital Production' должен быть видим")
                .shouldHave(text(TestData.EXPECTED_CREATIVE_DIGITAL_PRODUCTION_FOOTER_BANNER)
                        .because(String.format("Текст баннера 'Creative Digital Production' в футере на странице '%s' не соответствует ожидаемому", currentPageName)));
    }
}