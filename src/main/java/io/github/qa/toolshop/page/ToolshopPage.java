package io.github.qa.toolshop.page;

import io.github.qa.toolshop.PlaywrightContext;

public abstract class ToolshopPage extends PlaywrightContext {

    protected ToolshopPage() {
        ensureIsOnPage();
    }

    protected abstract void ensureIsOnPage();
}
