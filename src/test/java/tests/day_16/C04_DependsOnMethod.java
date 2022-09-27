package tests.day_16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C04_DependsOnMethod extends TestBaseBeforeClassAfterClass {
    @Test
    public void test01() {
        // amazon anasayfasina gidelim
        driver.get("https://www.amazon.com");
    }

    @Test (dependsOnMethods = "test01")
    public void test02() {
        // nutella aratalim
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nutella", Keys.ENTER);
    }

    @Test (dependsOnMethods = "test02")
    public void test03() {
        // sonuc yazisinin amazon icerdigini test edelim
        assert !driver.findElement(By.cssSelector("div[class=\"a-section a-spacing-small a-spacing-top-small\"]")).getText().contains("amazon");
    }
}
