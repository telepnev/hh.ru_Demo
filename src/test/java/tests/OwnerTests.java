package tests;

import config.WebdriverConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class OwnerTests {

    @Test
    @Disabled
    public void testTest() {
        WebdriverConfig config = ConfigFactory.newInstance().create(WebdriverConfig.class);

        System.out.println(config.baseUrl());
        System.out.println(config.userPassword());
        System.out.println(config.userLogin());
    }
}
