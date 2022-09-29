package tests.day_18;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_ConfigurationProperties {

    @Test
    public void test01() {

        // amazon ve facebook'a gidelim
        String urlAmazon = ConfigReader.getProperty("amazonUrl");
        Driver.getDriver().get(urlAmazon);

        String urlFacebook = ConfigReader.getProperty("facebookUrl");
        Driver.getDriver().get(urlFacebook);

        Driver.closeDriver();
    }
}
