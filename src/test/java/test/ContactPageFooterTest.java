package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.ContactFooterPage;
import pages.CookieBannerPage;

import static pages.BasePage.openPage;
import static testdata.TestData.CONTACTS_PAGE_URL;

public class ContactPageFooterTest extends BaseTest {

    CookieBannerPage cookieBannerPage = new CookieBannerPage();
    ContactFooterPage contactPage = new ContactFooterPage();

    @BeforeEach
    void setUp() {
        openPage(CONTACTS_PAGE_URL);
        contactPage.scrollToFooter();
        cookieBannerPage.acceptCookiesIfVisible();
    }

    @Test
    @DisplayName("Проверка элементов в футере на странице 'Контакты'")
    void contactPageFooterTest() {
        contactPage.checkAllContactFooterPage();
    }
}