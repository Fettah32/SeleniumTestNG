package tests.day_17;

import org.testng.annotations.Test;
import utilities.Driver;

public class C04_DriverIlkTest {


    @Test
    public void test01() {
        Driver.getDriver().get("https://www.amazon.com");
        Driver.getDriver().get("https://www.hepsiburada.com");
        Driver.getDriver().get("https://www.bestbuy.com");

        Driver.closeDriver();
    }
}
