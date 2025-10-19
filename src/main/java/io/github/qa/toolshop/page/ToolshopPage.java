package io.github.qa.toolshop.component.page;

import com.microsoft.playwright.Page;

public abstract class ToolshopPage {
    private final Page page;

    protected ToolshopPage(Page page) {
        this.page = page;
        ensureIsOnPage();
    }

    protected abstract void ensureIsOnPage();
}
