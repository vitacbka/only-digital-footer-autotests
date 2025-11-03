package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class FooterPage {
    private final SelenideElement footer = $("footer.Footer_root___6Q28");

    public final SelenideElement startProjectButton = footer.$("button.StartProjectButton_root__jB_Lv");

    public final SelenideElement behanceIcon = footer.$("div.Socials_socialsWrap__DPtp_ a:nth-child(1)");
    public final SelenideElement dprofileIcon = footer.$("div.Socials_socialsWrap__DPtp_ a:nth-child(2)");
    public final SelenideElement telegramIcon = footer.$("div.Socials_socialsWrap__DPtp_ a:nth-child(3)");
    public final SelenideElement vkIcon = footer.$("div.Socials_socialsWrap__DPtp_ a:nth-child(4)");

    public final SelenideElement copyright = footer.$("p.Footer_year__nyNCc");
    public final SelenideElement footerLogo = footer.$("svg.Footer_logo__2QEhf");
    public final SelenideElement footerSlogan = footer.$("p.Footer_text___ATim");

    public final SelenideElement emailLink = footer.$("a[href*='mailto:']");
    public final SelenideElement phoneText = footer.$("a[href*='tel:']");

    public final SelenideElement telegramForCommunicationText = footer.$("div.Telegram_telegramWrap__USZkq p.captions");
    public final SelenideElement telegramUsernameLink = footer.$("div.Telegram_telegramWrap__USZkq a");

    public final SelenideElement pdfButton = footer.$("div.Documents_documentsWrap__iNfwU a:first-child");
    public final SelenideElement pitchLink = footer.$("div.Documents_documentsWrap__iNfwU a:last-child");

    public final SelenideElement privacyPolicyLink = $x("//a[text()='Политика конфиденциальности']");

    public final SelenideElement creativeDigitalProductionFooterBanner = footer.$(".copyrightsBig");

    public void scrollToFooter() {
        footer.shouldBe(visible).scrollTo();
    }
}