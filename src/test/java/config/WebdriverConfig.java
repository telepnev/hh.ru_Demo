package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:default.properties",
        "classpath:secret.properties"
})
public interface WebdriverConfig extends Config {

    @Key("base.web.url")
    String baseUrl();

    @Key("user.password")
    String userPassword();

    @Key("user.login")
    String userLogin();

    @Key("remote.browser.credentials")
    String remoteBrowserUrl();

}
