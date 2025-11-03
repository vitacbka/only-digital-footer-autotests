package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.CareerFooterPage;
import pages.CookieBannerPage;

import static pages.BasePage.openPage;
import static testdata.TestData.CAREER_PAGE_URL;

public class CareerPageFooterTest extends BaseTest {

    CookieBannerPage cookieBannerPage = new CookieBannerPage();
    CareerFooterPage careerFooterPage = new CareerFooterPage();

    @BeforeEach
    void setUp() {
        openPage(CAREER_PAGE_URL);
        cookieBannerPage.acceptCookiesIfVisible();
        careerFooterPage.scrollToFooter();
    }

    @Test
    @DisplayName("Проверка элементов в футере на странице 'Карьера'")
    void careerPageFooterTest() {
        careerFooterPage.checkAllCareerFooterElements();
    }
}