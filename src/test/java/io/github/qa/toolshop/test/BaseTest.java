package io.github.qa.toolshop.test;

import com.microsoft.playwright.Page;
import io.github.qa.junit.PlaywrightExtension;
import io.github.qa.playwright.session.PlaywrightSessionManager;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(PlaywrightExtension.class)
public abstract class BaseTest {
    
    protected Page page() {
        return PlaywrightSessionManager.getCurrentSession().getPage();
    }
}
