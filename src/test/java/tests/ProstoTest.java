package tests;

import com.codeborne.selenide.Configuration;
import config.WebdriverConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

public class ProstoTest {
    WebdriverConfig config = ConfigFactory.newInstance().create(WebdriverConfig.class, System.getProperties());

    @Test
    void prosto() {
        System.out.println(Configuration.remote = config.remoteBrowserUrl() + System.getProperty("remote.browser.url") + ":4444/wd/hub/");


    }
}
