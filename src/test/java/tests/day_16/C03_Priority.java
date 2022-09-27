package tests.day_16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C03_Priority extends TestBaseBeforeMethodAfterMethod {
    // priority atanmazsa default olarak sifir kabul eder ve ona gore siralama yaparak calistirir.
    @Test (priority = 2)
    public void youtubeTest() {
        driver.get("https://www.youtube.com");
    }

    @Test (priority = 1)
    public void bestBuyTest() {
        driver.get("https://www.bestbuy.com");
    }

    @Test (priority = 3)
    public void amazonTest() {
        driver.get("https://www.amazon.com");
    }
}
