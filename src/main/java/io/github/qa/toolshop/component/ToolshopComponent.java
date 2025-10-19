package io.github.qa.toolshop.component;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.options.WaitForSelectorState;
import io.github.qa.toolshop.PlaywrightContext;

public abstract class ToolshopComponent extends PlaywrightContext {
    protected final Locator locator;

    protected ToolshopComponent(String selector) {
        this.locator = page().locator(selector);
        ensureIsOnComponent();
    }

    private void ensureIsOnComponent() {
        locator.waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
    }
}
