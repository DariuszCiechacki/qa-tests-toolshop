package io.github.qa.toolshop.page.home;

import io.github.qa.toolshop.page.ToolshopPage;

public class HomePage extends ToolshopPage {

    @Override
    protected void ensureIsOnPage() {
        page().waitForURL("https://practicesoftwaretesting.com");
    }
}
