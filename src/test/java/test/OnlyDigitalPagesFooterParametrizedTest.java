package test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import helper.FooterChecker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pages.BasePage;
import pages.CookieBannerPage;
import pages.FooterPage;

import java.util.stream.Stream;

import static com.codeborne.selenide.Condition.visible;
import static testdata.TestData.*;

public class OnlyDigitalPagesFooterParametrizedTest {

    private final CookieBannerPage cookieBannerPage = new CookieBannerPage();
    private final FooterChecker footerChecker = new FooterChecker();
    private final FooterPage footerPage = new FooterPage();

    @BeforeAll
    static void setUpAll() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = false;
        Configuration.reopenBrowserOnFail = false;
    }

    static Stream<Arguments> pageData() {
        return Stream.of(
                Arguments.of(MAIN_PAGE_URL, "Главная"),
                Arguments.of(PROJECT_PAGE_URL, "Проекты"),
                Arguments.of(COMPANY_PAGE_URL, "Компания"),
                Arguments.of(DIRECTION_PAGE_URL, "Направления"),
                Arguments.of(BLOG_PAGE_URL, "Блог")
        );
    }

    @ParameterizedTest
    @MethodSource("pageData")
    @DisplayName("Проверка футера на странице: {1}")
    void footerShouldBeConsistentOnAllPages(String url, String pageName) {
        BasePage.openPage(url);
        cookieBannerPage.acceptCookiesIfVisible();

        footerChecker.setPageName(pageName);

        preparePageForFooterCheck(url);

        footerChecker.checkAllFooterElements();
    }

    private void preparePageForFooterCheck(String url) {
        if (url.equals(BLOG_PAGE_URL)) {
            handleBlogPage();
        } else {
            footerPage.scrollToFooter();
            footerPage.footerLogo.shouldBe(visible);
        }
    }

    private void handleBlogPage() {
        footerPage.scrollToFooter();
        Selenide.sleep(3000);
        footerPage.scrollToFooter();
        footerPage.footerLogo.shouldBe(visible);
    }
}