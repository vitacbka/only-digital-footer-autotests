package helper;

import com.codeborne.selenide.Selenide;
import pages.FooterPage;

import static com.codeborne.selenide.Condition.visible;

public class NavigationHelper {

    public void scrollToFooterWithRetry(FooterPage footerPage) {
        footerPage.scrollToFooter();
        Selenide.sleep(3000);

        if (!footerPage.footerLogo.isDisplayed()) {
            footerPage.scrollToFooter();
        }
        footerPage.footerLogo.shouldBe(visible);
        footerPage.copyright.shouldBe(visible);
    }

    public void ensureFooterIsVisible(FooterPage footerPage) {
        if (!footerPage.footerLogo.isDisplayed()) {
            scrollToFooterWithRetry(footerPage);
        }
    }
}