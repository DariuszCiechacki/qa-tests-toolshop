package io.github.qa.toolshop.test;

import io.github.qa.toolshop.page.home.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OpenHomepageTest extends BaseTest {

    @Test
    void openHomePage1() {
        navigateToHomePage();
        Assertions.assertTrue(page().title().toLowerCase().contains("google"));
    }

    @Test
    void openHomePage2() {
        navigateToHomePage();
        Assertions.assertTrue(page().title().toLowerCase().contains("google"));
    }

    @Test
    void openHomePage3() {
        navigateToHomePage();
        Assertions.assertTrue(page().title().toLowerCase().contains("google"));
    }

    @Test
    void openHomePage4() {
        navigateToHomePage();
        Assertions.assertTrue(page().title().toLowerCase().contains("google"));
    }

    @Test
    void openHomePage5() {
        navigateToHomePage();
        Assertions.assertTrue(page().title().toLowerCase().contains("google"));
    }

    private HomePage navigateToHomePage() {
        page().navigate("https://google.com/");
        return new HomePage();
    }
}
