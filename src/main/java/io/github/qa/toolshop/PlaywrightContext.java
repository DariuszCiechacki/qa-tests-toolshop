package io.github.qa.toolshop;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import io.github.qa.playwright.session.PlaywrightSessionManager;

public abstract class PlaywrightContext {

    protected Page page() {
        return getCurrentSession().getPage();
    }

    protected BrowserContext context() {
        return getCurrentSession().getContext();
    }

    private PlaywrightSessionManager getCurrentSession() {
        return PlaywrightSessionManager.getCurrentSession();
    }
}
