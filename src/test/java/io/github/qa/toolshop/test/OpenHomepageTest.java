package io.github.qa.toolshop.test;

import io.github.qa.toolshop.page.home.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OpenHomepageTest extends BaseTest {

    @Test
    void openHomePage() {
        navigateToHomePage();
        Assertions.assertTrue(page().title().contains("Toolshop"));
    }

    private HomePage navigateToHomePage() {
        page().navigate("https://practicesoftwaretesting.com/");
        return new HomePage();
    }
}
