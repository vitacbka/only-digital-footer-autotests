package pages;

import com.codeborne.selenide.Selenide;

public class BasePage {

    public static void openPage(String url) {
        Selenide.open(url);
    }
}