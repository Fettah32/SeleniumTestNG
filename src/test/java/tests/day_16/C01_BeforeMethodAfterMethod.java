package tests.day_16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C01_BeforeMethodAfterMethod extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void amazonTesti() {
        driver.get("https://www.amazon.com");
    }

    @Test
    public void bestBuyTesti() {
        driver.get("https://www.bestbuy.com");
    }

    @Test
    public void techProEducationTesti() {
        driver.get("https://www.techproeducation.com");
    }
}
