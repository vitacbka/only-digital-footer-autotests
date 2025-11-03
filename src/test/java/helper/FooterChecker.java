package helper;

import pages.FooterPage;
import testdata.TestData;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class FooterChecker {

    private final FooterPage footerPage = new FooterPage();

    public void checkAllFooterElements() {
        footerPage.startProjectButton.shouldBe(visible)
                .as("Кнопка 'Начать проект' должна быть видима")
                .shouldHave(text(TestData.EXPECTED_FOOTER_START_PROJECT_BUTTON_TEXT))
                .as("Текст кнопки 'Начать проект' не соответствует ожидаемому");

        footerPage.behanceIcon.shouldBe(visible)
                .as("Иконка Behance должна быть видима")
                .shouldHave(text("be"))
                .as("Иконка Behance должна содержать текст 'be'");

        footerPage.dprofileIcon.shouldBe(visible)
                .as("Иконка DProfile должна быть видима")
                .shouldHave(text("dp"))
                .as("Иконка DProfile должна содержать текст 'dp'");

        footerPage.telegramIcon.shouldBe(visible)
                .as("Иконка Telegram должна быть видима")
                .shouldHave(text("tg"))
                .as("Иконка Telegram должна содержать текст 'tg'");

        footerPage.vkIcon.shouldBe(visible)
                .as("Иконка VK должна быть видима")
                .shouldHave(text("vk"))
                .as("Иконка VK должна содержать текст 'vk'");

        footerPage.copyright.shouldBe(visible)
                .as("Копирайт должен быть видим")
                .shouldHave(text(TestData.EXPECTED_FOOTER_COPYRIGHT))
                .as("Текст копирайта не соответствует ожидаемому");

        footerPage.footerLogo.shouldBe(visible)
                .as("Логотип в футере должен быть видим");

        footerPage.footerSlogan.shouldBe(visible)
                .as("Слоган в футере должен быть видим")
                .shouldHave(text(TestData.EXPECTED_FOOTER_SLOGAN_TEXT))
                .as("Текст слогана не соответствует ожидаемому");

        footerPage.emailLink.shouldBe(visible)
                .as("Ссылка email должна быть видима")
                .shouldHave(text(TestData.EXPECTED_FOOTER_EMAIL_TEXT))
                .as("Текст email ссылки не соответствует ожидаемому");

        footerPage.phoneText.shouldBe(visible)
                .as("Текст телефона должен быть видим")
                .shouldHave(text(TestData.EXPECTED_FOOTER_PHONE_TEXT))
                .as("Текст телефона не соответствует ожидаемому");

        footerPage.telegramForCommunicationText.shouldBe(visible)
                .as("Текст 'Telegram для связи' должен быть видим")
                .shouldHave(text(TestData.EXPECTED_TELEGRAM_FOR_COMMUNICATION_TEXT))
                .as("Текст 'Telegram для связи' не соответствует ожидаемому");

        footerPage.telegramUsernameLink.shouldBe(visible)
                .as("Ссылка telegram username не отображается")
                .shouldHave(text(TestData.EXPECTED_FOOTER_TELEGRAM_TEXT))
                .as("Текст ссылки Telegram не соответствует ожидаемому");

        footerPage.pdfButton.shouldBe(visible)
                .as("Кнопка PDF должна быть видима")
                .shouldHave(text("pdf"))
                .as("Кнопка PDF должна содержать текст 'pdf'");

        footerPage.pitchLink.shouldBe(visible)
                .as("Ссылка Pitch должна быть видима")
                .shouldHave(text("pitch"))
                .as("Ссылка Pitch должна содержать текст 'pitch'");

        footerPage.privacyPolicyLink.shouldBe(visible)
                .as("Ссылка 'Политика конфиденциальности' должна быть видима")
                .shouldHave(text(TestData.EXPECTED_FOOTER_PRIVACY_LINK_TEXT))
                .as("Текст ссылки 'Политика конфиденциальности' не соответствует ожидаемому");

        footerPage.creativeDigitalProductionFooterBanner.shouldBe(visible)
                .as("Баннер 'Creative Digital Production' должен быть видим")
                .shouldHave(text(TestData.EXPECTED_CREATIVE_DIGITAL_PRODUCTION_FOOTER_BANNER))
                .as("Текст баннера 'Creative Digital Production' не соответствует ожидаемому");
    }
}